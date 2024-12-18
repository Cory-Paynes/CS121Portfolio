package weekThree;
import java.util.Scanner;
public class SwitchStatements
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int mon = 0;
        String monStr = "";

        System.out.println("Chose a number that corresponds to a month:\n" +
                "January - 1\n" +
                "February - 2\n" +
                "March - 3\n" +
                "April - 4\n" +
                "May - 5\n" +
                "June - 6\n" +
                "July - 7\n" +
                "August - 8\n" +
                "September - 9\n" +
                "October - 10\n" +
                "November - 11\n" +
                "December - 12");
        mon = scn.nextInt();

        switch (mon) {
            case 1:
                monStr = "January\n" +
                        "Days: 31\n" +
                        "Holidays: New Year's Day, Martin Luther King Jr. Day\n" +
                        "Signs: Capricorn (1-19), Aquarius (20-31)\n";
                break;
            case 2:
                monStr = "February\n" +
                        "Days: 28(29)\n" +
                        "Holidays: Black History Month, Valentine's Day, Presidents Day, Groundhog Day\n" +
                        "Signs: Aquarius (1-18), Pisces (19-28) \n";
                break;
            case 3:
                monStr = "March\n" +
                        "Days: 31\n" +
                        "Holidays: St. Patrick's Day, Easter\n" +
                        "Signs: Pisces (1-20), Aries (21-31)\n";
                break;
            case 4:
                monStr = "April\n" +
                        "Days: 30\n" +
                        "Holidays: Earth Day, Good Friday\n" +
                        "Signs: Aries (1-19), Taurus (20-30)\n";
                break;
            case 5:
                monStr = "May\n" +
                        "Days: 31\n" +
                        "Holidays: Cinco De Mayo, Mother's Day, Memorial Day\n" +
                        "Signs: Taurus (1-20), Gemini (21-31)\n";
                break;
            case 6:
                monStr = "June\n" +
                        "Days: 30\n" +
                        "Holidays: Father's Day, Juneteenth\n" +
                        "Signs: Gemini (1-20), Cancer (21-30)\n";
                break;
            case 7:
                monStr = "July\n" +
                        "Days: 31\n" +
                        "Holidays: 4th of July \n" +
                        "Signs: Cancer (1-22), Leo (23-31)\n";
                break;
            case 8:
                monStr = "August\n" +
                        "Days: 31\n" +
                        "Holidays: N/A\n" +
                        "Signs: Leo (1-22), Virgo (23-31)\n";
                break;
            case 9:
                monStr = "September\n" +
                        "Days: 30\n" +
                        "Holidays: Labor Day\n" +
                        "Signs: Virgo (1-22), Libra (23-30)\n";
                break;
            case 10:
                monStr = "October\n" +
                        "Days: 31\n" +
                        "Holidays: Halloween\n" +
                        "Signs: Libra (1-22), Scorpio (23-31)\n";
                break;
            case 11:
                monStr = "November\n" +
                        "Days: 30\n" +
                        "Holidays: Veterans Day. Thanksgiving\n" +
                        "Signs: Scorpio (1-21), Sagittarius (22-30)\n";
                break;
            case 12:
                monStr = "December\n" +
                        "Days: 31\n" +
                        "Holidays: Christmas\n" +
                        "Signs: Sagittarius (1-21), Capricorn (22-31)\n";
                break;
            default:
                monStr = "Not a valid month";
                break;
        }
        System.out.println(monStr);
    }
}
