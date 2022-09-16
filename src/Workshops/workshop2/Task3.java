package Workshops.workshop2;

public class Task3 {
    /**
     * Каждый смайлик должен содержать допустимую пару глаз. Глаза можно обозначить как : или ;
     * У смайлика может быть нос, но это не обязательно.
     * Допустимые символы для носа - или ~
     * У каждого улыбающегося лица должен быть улыбающийся рот, который должен быть отмечен либо ), либо D
     * Использование дополнительных символов не допускается, кроме упомянутых.
     * <p>
     * Примеры валидных смайлов:   :) :D ;-D :~)
     * Примеры невалидных смайлов: ;( :> :} :]
     * <p>
     * Пример
     * countSmileys ([":)", "; (", ";}", ":-D"]); // должен вернуть 2;
     * countSmileys (["; D", ":-(", ":-)", "; ~)"]); // должен вернуть 1;
     * countSmileys ([";]", ": [", "; *", ": $", ";-D"]); // должен вернуть 1;
     * Примечание
     * В случае пустого массива возвратите 0.
     * Порядок элементов лица (глаза, нос, рот) всегда будет одинаковым.
     */
    public static void main(String[] args) {
        String[] arr = {";D", ":-(", ":-)", "; ~)"};
        System.out.println(countSmileys(arr));
    }

    public static int countSmileys(String[] arr) {
        int count = 0;
        int arrayLength = arr.length;
        for (int i = 0; i < arrayLength; i++) {
            if ((arr[i].charAt(0) == ':') || (arr[i].charAt(0) == ';')) {
                if ((arr[i].charAt(1) == '-' || arr[i].charAt(1) == '~') && (arr[i].charAt(2) == ')' || arr[i].charAt(2) == 'D')) {
                    count++;
                } else if (arr[i].charAt(1) == '-' || arr[i].charAt(1) == '~') {
                    count++;
                }
            }

        }
        return count;
    }
}

