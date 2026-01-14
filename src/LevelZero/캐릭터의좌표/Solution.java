package LevelZero.캐릭터의좌표;

import LevelOne.이웃한_칸.Direction;

public class Solution
{
    private enum DIRECTION
    {
        UP(0, 1)
        , DOWN(0, -1)
        , LEFT(-1, 0)
        , RIGHT(1, 0);

        private int x;
        private int y;

        DIRECTION(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        public int getX()
        {
            return x;
        }

        public int getY()
        {
            return y;
        }
    }

    ;

    public static void main(String[] args)
    {
        String[] keyinput = {"down", "down", "down", "down", "down"};
        int[] board = {7,9};

        int xSize = (board[0] - 1) / 2;
        int ySize = (board[1] - 1) / 2;

        int x = 0;
        int y = 0;

        for(String direct : keyinput)
        {
            Direction d = Direction.valueOf(direct.toUpperCase());

            int nextX = x + d.getX();
            int nextY = y + d.getY();

            if(Math.abs(nextX) <= xSize)
                x = nextX;

            if(Math.abs(nextY) <= ySize)
                y = nextY;
        }

        int[] result = new int[]{x, y};
    }
}
