import java.io.*;
        import java.net.*;
        import java.util.*;

public class ClientPart {
    public static void main(String[] args) throws IOException {
        Scanner consoleScanner = new Scanner(System.in);
        InetSocketAddress address = new InetSocketAddress(InetAddress.getLocalHost(), 1879);
        CommandsReader commandsReader = new CommandsReader(address);
        boolean needNormalMode = true;
        while (needNormalMode) {
            needNormalMode = commandsReader.read(consoleScanner, false);
        }
    }
}

