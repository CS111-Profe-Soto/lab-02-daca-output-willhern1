/**
 * EMPLOYMENT AUTHORIZATION CARD
 * @author William Hernandez
 */
public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String surName = "SPECIMEN";
		String givenName = "TEST V";
		String uscisNumber = "000-000-725";
		String category = "C09";
		String cardNumber = "SRC0000000725";
		String countryOfBirth = "Ethopia";
		String termsandconditions = "None";
		String dateOfBirth = "01 JAN 1920";
		String sex = "M";
		String idValid = "01/01/80";
		String idExpires = "05/10/11";
		String reentryWarning = "NOT VALID FOR REENTRY TO U.S.";
		int dacaRecipients = 700000;

		//INPUT SECTION
		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════╗");
		System.out.println("║         UNITED STATES OF AMERICA                                     ║");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD       ║");
		System.out.println("║                       Surname                                        ║");
		System.out.println("║                       " + surName + "                                       ║");
		System.out.println("║  .----.    .----.     Given Name                                     ║");
		System.out.println("║ (   ^  \\  /  ^   )    "+ givenName + "                                         ║");
		System.out.println("║        |  |           USCIS#         Category   Card#                ║");
		System.out.println("║       _/  \\_          "+ uscisNumber + "    "  +  category + "        " + cardNumber + "        ║");
		System.out.println("║      (_    _)         Country of Birth                               ║");
		System.out.println("║   ,    `--`    ,      " + countryOfBirth + "                                        ║");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions                           ║");
		System.out.println("║    \\          /       " + termsandconditions + "                                           ║");
		System.out.println("║     '.--..--.'        Date of Birth   Sex                            ║");
		System.out.println("║       `\"\"\"\"\"`         " + dateOfBirth + "     " + sex + "                              ║");
		System.out.println("║                       Valid From:    " + idValid + "                        ║");
		System.out.println("║                       Card Expires:  " + idExpires + "                        ║");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.                  ║");
		System.out.println("╚══════════════════════════════════════════════════════════════════════╝");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}
