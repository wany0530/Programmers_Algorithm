package LevelOne.데이터분석;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        int[][] dataArr = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};

        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);

        String ext = "date";
        String val_ext = "20300501";
        String sort_by = "remain";

        int extIdx = map.get(ext);
        int sortIdx = map.get(sort_by);

        List<int[]> list = new ArrayList<>();
        for(int[] datas : dataArr)
        {
            if(datas[extIdx] < Integer.parseInt(val_ext))
            {
                list.add(datas);
            }
        }

        list.sort(Comparator.comparingInt(o -> o[sortIdx]));

        int[][] result = new int[list.size()][];
        for(int i=0; i<list.size(); i++)
        {
            result[i] = list.get(i);
        }

        String a= "";



    }

    private static class Data
    {
        private int code;
        private int date;
        private int maximum;
        private int remain;

        public Data(int[] datas)
        {
            this.code = datas[0];
            this.date = datas[1];
            this.maximum = datas[2];
            this.remain = datas[3];
        }

        public int getCode()
        {
            return code;
        }

        public int getDate()
        {
            return date;
        }

        public int getMaximum()
        {
            return maximum;
        }

        public int getRemain()
        {
            return remain;
        }

        public void test(String ext)
        {

        }
    }
}
