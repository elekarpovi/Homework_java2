// Task_0
// public class Task_0 {
// // Посчитайте сколько драгоценных камней в куче обычных камней
// // Пример:
// // jewels = “aB”, stones = “aaaAbbbB”
// // Результат в консоль ”a3B1”
// public static void main(String[] args) {
// }
// public String findJewelsInStones(String jewels, String stones) {
// return "";
// }
// }

public class task {
    public static void main(String[] args) {
        String jewels = "aB", stones = "aaaAbbbB";
        System.out.println(findJewelsInStones(jewels,stones));
    }
    public static String findJewelsInStones(String jewels, String stones) {
        StringBuilder builder = new StringBuilder();
        char [] jew = jewels.toCharArray();
        char [] st = stones.toCharArray();
        for (char i:jew){
            int count = 0;
            for(char j:st){
                if (i==j) count++;
            }

            builder.append(i);
            builder.append(count);
        }
        return builder.toString();
    }
}