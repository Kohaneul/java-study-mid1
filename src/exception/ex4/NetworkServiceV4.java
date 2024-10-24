package exception.ex4;


import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.NetworkClientExceptionV4;

public class NetworkServiceV4_1 {
    public void sendMessage(String data){
        String address="http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);

        client.initError(data); //추가
        try {
            client.connect();
            client.send(data);
        }
        catch (ConnectExceptionV4 e) {
            System.out.println("[연결 오류] 주소 : "+e.getAddress()+", 메시지 :"+e.getMessage());
        }
        catch (NetworkClientExceptionV4 e) {
            System.out.println("[네트워크 오류] 메시지 :"+e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("[알 수 없는 오류] "+e.getMessage());
        }
        finally{
            client.disconnect();
        }

    }
}
