package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        // 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램 작성
        // 주민등록번호는 13자리의 숫자로 구성
        // 앞 6자리는 생년원일 정보, 뒷 7자리 중 첫 번째 숫자는 성별 정보
        // 입력 데이터는 -을 포함한 14자리의 문자열 형태
        // "901231-1234567" 인 경우 901231-1 까지 출력
        // "030708-4567890" 인 경우 030708-4 까지 출력

        String ssn = "901231-1234567";
        String ssn2 = "030708-4567890";
        System.out.println(ssn.substring(0, 8));
        System.out.println(ssn2.substring(0, ssn2.indexOf("-") + 2));

    }
}
