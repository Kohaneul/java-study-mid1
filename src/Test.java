public class Test {

    public static void main(String[] args) {
       
        String url =  "/WINUS/WMSOP210.action";
        String url2 = "/WINUS/WMSOP210/list1.action";

        String s = splitURL(url);
        System.out.println("s = " + s);
        String s2 = splitURL(url2);
        System.out.println("s2 = " + s2);
    }


    public static String splitURL(String url){
        if (url == null || url.isEmpty()) {
            return url; // 입력 URL이 null이거나 빈 문자열인 경우 그대로 반환
        }
        String[] splitURL = url.split("/");
        int idx = splitURL.length - 1;

        if (splitURL.length > 3) {
            idx = idx - 1;

            int indexOfListString = url.indexOf("/list");
            if (indexOfListString != -1) {
                int dotIndex = url.indexOf(".");
                if (dotIndex != -1 && dotIndex > indexOfListString + 5) {
                    String substring = url.substring(indexOfListString + 5, dotIndex);
                    return splitURL[idx] + "E" + substring;
                }
            }

            // "/list" 뒤에 숫자가 없는 경우
            return splitURL[idx] + "E1";
        }

        return splitURL[idx];
    }
//    public static String splitURL(String url){
//        // /WINUS/WMSOP210.action WMSOP210 추출 , /WINUS/WMSOP210/list.action -> WMSOP210E1
//
//        if(url ==null || url.isEmpty()){
//            return url;
//        }
//
//        String[] splitURL = url.split("/");
//        int idx = splitURL.length-1;
//        if(splitURL.length>3){
//            idx = idx-1;
//            int startIndex = url.indexOf("/list");
//            int endIndex = url.indexOf(".");
//            if(endIndex != -1 && endIndex>startIndex+1){
//                String substring = url.substring(startIndex+5,endIndex);
//                return splitURL[idx]+"E"+substring;
//            }
//        }
//
//
//        url = splitURL[idx];
//
//        return url;
//    }



}
