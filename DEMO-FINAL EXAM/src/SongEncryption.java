import java.util.Scanner;

public class SongEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] artistAndSong = input.split(":");
            String artist = artistAndSong[0];
            String song = artistAndSong[1];

            if (validArtist(artist) && validSong(song)) {
                int encriptionKey = artist.length() % ('z' - 'a'+1);

                String encryptedArtist = encrypt(artist, encriptionKey);
                String encryptedSong = encrypt(song, encriptionKey);
                System.out.printf("Successful encryption: %s@%s\n", encryptedArtist, encryptedSong);
            } else {
                System.out.println("Invalid input!");
            }
            input = scanner.nextLine();
        }

    }

    private static String encrypt(String s, int encriptionKey) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            char enkryptedCh;
            if (ch != ' '&&ch!='\'') {
                enkryptedCh = (char) (ch + encriptionKey);
                if (Character.isUpperCase(ch) && enkryptedCh > 'Z') {
                    enkryptedCh = (char) ('A' + (enkryptedCh - 'Z' - 1));
                }
                if (Character.isLowerCase(ch) && enkryptedCh > 'z') {
                    enkryptedCh = (char) ('a' + (enkryptedCh - 'z' - 1));
                }
            }else{
                enkryptedCh = ch;
            }
            sb.append(enkryptedCh);
        }

        return sb.toString();
    }

    private static boolean validArtist(String artist) {
        if (!Character.isUpperCase(artist.charAt(0))) {
            return false;
        }

        for (int i = 1; i < artist.length(); i++) {
            char ch = artist.charAt(i);
            boolean isValidChar = 'a' <= ch && ch <= 'z' || ch == '\'' || ch == ' ';

            if (!isValidChar) {
                return false;
            }
        }
        return true;
    }

    private static boolean validSong(String song) {
        for (int i = 0; i < song.length(); i++) {
            char ch = song.charAt(i);
            boolean isValidChar = 'A' <= ch && ch <= 'Z' || ch == ' ';

            if (!isValidChar) {
                return false;
            }
        }
        return true;
    }
}
