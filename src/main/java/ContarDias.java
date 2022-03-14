import java.util.Calendar;

/*
* 05 Contar Dias
    Con la emoción, ya estamos empezando a contar los días del calendario hasta el 25 de diciembre 📆.

    Para ayudar a esto, vamos a crear una función que pasándole una instancia de Date nos diga el número de días que faltan.

    Veamos unos ejemplos:

    const date1 = new Date('Dec 1, 2021')
    daysToXmas(date1) // 24
    const date2 = new Date('Dec 24, 2021 00:00:01')
    daysToXmas(date2) // 1
    const date3 = new Date('Dec 24, 2021 23:59:59')
    daysToXmas(date3) // 1
    const date4 = new Date("December 20, 2021 03:24:00")
    daysToXmas(date4) // 5
    El resultado tiene que ser un número entero y, como ves, aunque falte un segundo hasta el siguiente día, se entiende que todavía falta un día.

    ¡Pero ojo! También hay que indicar si la fecha es del mismo día (devolveríamos 0) o si es una fecha futura (devolveríamos el número de días en negativo -):

    const date = new Date('Dec 25, 2021')
    daysToXmas(date) // 0
    const date1 = new Date('Dec 26, 2021')
    daysToXmas(date1) // -1
    const date2 = new Date('Dec 31, 2021')
    daysToXmas(date2) // -6
    const date3 = new Date('Jan 1, 2022 00:00:01')
    daysToXmas(date3) // -7
    const date4 = new Date('Jan 1, 2022 23:59:59')
    daysToXmas(date4) // -7
    Por cierto, la fecha de referencia para saber si es 25 de diciembre es Dec 25, 2021.
*/
public class ContarDias {

    static final int timestampDay = 86_400_000;

    public static int main(Calendar date) {

        Calendar targetDate = getTargetDate();

        double calcDays = (targetDate.getTimeInMillis() - date.getTimeInMillis()) / timestampDay;

        if(calcDays <= 0 && targetDate.get(Calendar.DAY_OF_MONTH) != date.get(Calendar.DAY_OF_MONTH)) calcDays -= 1;

        return (int) Math.ceil( calcDays );
    }

    private static Calendar getTargetDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021,Calendar.DECEMBER,25);
        return calendar;
    }

}
