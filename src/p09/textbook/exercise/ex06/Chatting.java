package p09.textbook.exercise.ex06;

public class Chatting {
	void start(String chatId) {
		String nickName = chatId;

		Chat chat = new Chat() {

			@Override
			public void start() {
				while (true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};

		chat.start();
	}

	class Chat {
		void start() {
		}

		void sendMessage(String message) {
		}
	}
}
