// Task_2

// На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - 
// строки книги. потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. 
// Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека 
// аллергия и продукт2 - продукт, на который следует заменить продукт1. Гарантируется что любой продукт 
// состоит из 1 слова. название продуктов написаны строчными буквами. Гарантируется, что продукты, на 
// которые нужно выполнить замену, не встречаются изначально в тексте.

// Выходные данные
// Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте 
// внимание. ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна 
// начинаться с большой буквы!

// Sample Input:

// 2
// Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на 
// мороженое.
// Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
// 3
// арахис - колбаса
// клубника - вишня
// сгущенка - молоко
// Sample Output:

// Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса 
// на мороженое.
// Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.


public class task2 {
    public static void main(String[] args) {
        int n = 2;
        String [] n_array = new String[n];
        n_array[0] = "Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.";
        n_array[1]= "Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.";
        int m =3;
        String [] m_array = new String[m];
        m_array[0] = "арахис - колбаса";
        m_array[1] = "клубника - вишня";
        m_array[2] = "сгущенка - молоко";

        change_book(n_array, m_array);

        for (String i: n_array) {
            System.out.println(i);
        }
    }

    public static void change_book(String[]arrayN, String[]arrayM){
        for( int i = 0; i < arrayN.length; i++) {
            for (String m: arrayM) {
                arrayN[i] = change_record(arrayN[i],m);
            }
        }
    }

    public static String change_record(String n, String m){
        String [] m_record = m.split(" - ");
          n = n.replace(m_record[0], m_record[1]);
          n = n.replace(cap_letter(m_record[0]), cap_letter(m_record[1]) );
        return n;
    } 

    public static String cap_letter(String change_word){
        change_word = change_word.substring(0, 1).toUpperCase() + change_word.substring(1);
        return change_word;
    }
}