package java8;

public class MessagbleImpl {
	public static void main(String[] args) {
		// Constructor reference using new Operator
		
		Messageble msg = Message::new;
		msg.getMessage("Balu");
	}

}
