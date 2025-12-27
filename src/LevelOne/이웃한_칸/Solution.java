package LevelOne.이웃한_칸;

public class Solution
{
    public static void main(String[] args)
    {
//        String[][] board = {{"blue", "red", "orange", "red"}
//                            , {"red", "red", "blue", "orange"}
//                            , {"blue", "orange", "red", "red"}
//                            , {"orange", "orange", "red", "blue"}};
//

        String[][] board = {{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}};

        int h = 0;
        int w = 1;
        int result = 0;
        String base = board[h][w];
        int maxX = board[0].length;
        int maxY = board.length;

        for(Direction d : Direction.values())
        {
            if(d.culcX(w) < 0 || d.culcX(w) > maxX - 1 || d.culcY(h) < 0 || d.culcY(h) > maxY - 1)
                continue;

            if(board[d.culcY(h)][d.culcX(w)].equals(base))
                result++;
        }

        System.out.println("result = " + result);
    }
}
