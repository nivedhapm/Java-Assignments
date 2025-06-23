package interfaces;
import java.util.Scanner;

// Interface
interface Playable {
    void play();
    void pause();
    void stop();
}

// MP3 Player implementation
class MP3Player implements Playable {
    public void play() {
        System.out.println("MP3 Player: Playing MP3 file...");
    }

    public void pause() {
        System.out.println("MP3 Player: Paused.");
    }

    public void stop() {
        System.out.println("MP3 Player: Stopped.");
    }
}

// CD Player implementation
class CDPlayer implements Playable {
    public void play() {
        System.out.println("CD Player: Playing CD...");
    }

    public void pause() {
        System.out.println("CD Player: Paused.");
    }

    public void stop() {
        System.out.println("CD Player: Stopped.");
    }
}

// Streaming Player implementation
class StreamingPlayer implements Playable {
    public void play() {
        System.out.println("Streaming Player: Streaming music...");
    }

    public void pause() {
        System.out.println("Streaming Player: Paused streaming.");
    }

    public void stop() {
        System.out.println("Streaming Player: Stopped streaming.");
    }
}

// Demo class
public class MusicPlayerDemo {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    while (true) {
	        System.out.println("\nChoose Music Player:");
	        System.out.println("1. MP3 Player");
	        System.out.println("2. CD Player");
	        System.out.println("3. Streaming Player");
	        System.out.println("4. Exit Program");
	        System.out.print("Enter choice: ");
	        int choice = sc.nextInt();

	        Playable player = null;
	        switch (choice) {
	            case 1 -> player = new MP3Player();
	            case 2 -> player = new CDPlayer();
	            case 3 -> player = new StreamingPlayer();
	            case 4 -> {
	                System.out.println("Exiting the program...");
	                sc.close();
	                return;
	            }
	            default -> {
	                System.out.println("Invalid choice. Try again.");
	                continue;
	            }
	        }

	        // Playback control loop for selected player
	        while (true) {
	            System.out.println("\n1. Play\n2. Pause\n3. Stop\n4. Back to Player Menu");
	            System.out.print("Enter action: ");
	            int action = sc.nextInt();

	            switch (action) {
	                case 1 -> player.play();
	                case 2 -> player.pause();
	                case 3 -> player.stop();
	                case 4 -> {
	                    System.out.println("Returning to player selection...");
	                    break;
	                }
	                default -> System.out.println("Invalid action.");
	            }

	            if (action == 4) break;
	        }
	    }
	}
}
