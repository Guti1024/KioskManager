import io.netty.util.Timeout;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.List;



public class sampleapp {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/hyunmin.cho/Downloads/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();

//  <<PMS PART>>
        driver.get("https://yflux-pms.dev.yflux.in/");
//        driver.manage().window().maximize();  //화면 최대화
//      (로그인)
        driver.findElement(By.xpath("//*[@id='PMS-Container']/div/div/div[2]/div[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"input-36\"]")).sendKeys("guti1024@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-42\"]")).sendKeys("!Dmsco0822");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/button/span")).click();
        System.out.println("로그인 완료 되었습니다.");
//      (/로그인)
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//      (설정)
        driver.findElement(By.xpath("//*[@id=\"PMS-LNB\"]/div[1]/div[8]/div/div[1]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"PMS-LNB\"]/div[1]/div[8]/div/div[2]/div[3]/span")).click();
        System.out.println("설정 메뉴에 접근하였습니다.");
//      (/설정)

//     (객실등록)
//        (버튼)
        Thread.sleep(2000);
        WebElement button = driver.findElement(By.xpath("//*[@id='pms-operation-management-roomsettings']/div[1]/div[2]/button"));
//        System.out.println(button.getText());
        button.click();
//      (/버튼)


////      (~ing+NotNecessary)//combobox 에 접근 및 div tags 들 변수에 저장 후 반복해서 각 text 출력하는 코드(STD/DLX 등등)
//        WebElement combobox = driver.findElement(By.xpath("//*[@id=\"popup-room-settings\"]/div[1]/div/div/div/div[2]"));
//        List<WebElement> items = combobox.findElements(By.xpath("div"));
////        System.out.println(items.size());
//        for(int i = 0; i < items.size(); i++)
//        {
//            System.out.println(items.get(i).findElement(By.tagName("span")).getText());
//        }
////
//          (객실 타입 추가)
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"popup-room-settings\"]/div[1]/div/div[1]/div/div[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"popup-room-settings\"]/div[1]/div/div/div/div[2]/div[2]/span")).click();
        System.out.println("STD 선택 완료");
//        (/객실 타입 추가)
//         (필수 필드 입력)
        Thread.sleep(500);
//        TimeZone utc = TimeZone.getTimeZone("UTC");
//        Calendar calendar = Calendar.getInstance(utc);
//        String pattern = "yyyy.MM.dd";
       Date date = new Date();
       String time = String.valueOf(date);
//       System.out.println(date);
//       System.out.println(Arrays.toString(time.split("\\s")));
       String usingDate = Arrays.toString(new String[]{time.split("\\s")[3]});
       driver.findElement(By.xpath("//*[@id=\"popup-room-settings\"]/div[2]/div/div[1]/div/input")).sendKeys("테스트업장"+ usingDate);

        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"popup-room-settings\"]/div[3]/div/div/div/div[1]/span")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"popup-room-settings\"]/div[3]/div/div/div/div[2]/div[2]/span")).click();
        System.out.println("모든 필수 필드 입력 완료");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"base-popup\"]/div[3]/button[2]/div[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"PMS-Container\"]/span/div[2]/div/div[2]/div[2]/button[2]")).click();
        System.out.println("객실 등록이 완료 되었습니다.");
//       (/필수 필드 입력)
//      (/객실등록)




//        WebElement element = driver.findElement(By.xpath("//*[@id=\"pms-operation-management-roomsettings\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/p"));
//        System.out.println(element.getAttribute("value"));
//        System.out.println(element.getAttribute("text"));
//        System.out.println(element.getAttribute("innerHTML"));
//        System.out.println(element.getAttribute("tag"));
//        System.out.println(element.getAttribute("tagName"));
//        System.out.println(element.findElement(By.tagName("P")).getAttribute("value"));
//        System.out.println(element.findElement(By.tagName("P")).getAttribute("text"));
//        System.out.println(element.findElement(By.tagName("P")).getAttribute("innerHTML"));
//        driver.findElement(By.xpath("//*[@id=\"pms-operation-management-roomsettings\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div[1]")).getAttribute("innerHTML");
//        driver.findElement(By.xpath("//*[@id=\"pms-operation-management-roomsettings\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/p")).getAttribute("text");
//        driver.findElement(By.xpath("//*[@id=\"pms-operation-management-roomsettings\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div[1]")).getText();
        //       WebElement table = driver.findElement(By.xpath("//*[@id=\"pms-operation-management-roomsettings\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div[2]/div/div"));
//        List <WebElement> rooms = table.findElements(By.xpath(("div")).findElement(By.xpath(("div")).findElement((SearchContext) By.xpath(("p")),
////      (~ing 생성 된 객실 고유 식별 값 변수에 저장)
//        Thread.sleep(500);
//
////        WebElement table = driver.findElement(By.xpath("//*[@id=\"pms-operation-management-roomsettings\"]/div[3]/div"));
////        //*[@id="pms-operation-management-roomsettings"]/div[3]/div/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/div[2]
////        driver.findElement(By.xpath("$x('//div[contains(@class,\"ag-row\")]//div[@col-id=\"NO\"]//p')")).getAttribute("id");
//
////*[@id="pms-operation-management-roomsettings"]/div[3]/div/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[13]/div[2]/div/p
////*[@id="pms-operation-management-roomsettings"]/div[3]/div/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[16]/div[2]/div/p
//
//
////        WebElement room_table = driver.findElement(By.xpath("//*[@id=\"pms-operation-management-roomsettings\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/p"));
////        driver.findElement(By.xpath("//*[@id=\"pms-operation-management-roomsettings\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/p")).findElement(By.xpath("1201")).click();
////        WebElement roomName = driver.findElement(By.xpath("//*[@id=\"pms-operation-management-roomsettings\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/div[2]/div/p"));
////
////      <</PMS PART>>
//
////      <<KIOSK MANAGER PART>>
////      (Kiosk Manager 접근)
//
//        ((JavascriptExecutor) driver).executeScript("window.open()");
//        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); // 탭리스트 가져오기
//        driver.switchTo().window(tabs.get(1)).navigate().to("https://kiosk.dev.yflux.in/");
////      (/Kiosk Manager 접근)
//
////      (로그인)
//        driver.findElement(By.xpath("//*[@id='app']/div/div/main/div/div/div/section[3]/button/span[3]")).click();
//        System.out.println("로그인 완료 되었습니다.");
////        (/로그인)
////     (연동)
//        Thread.sleep(2000);
//
//        driver.findElement(By.xpath("//*[@id=\"v-list-group--id-Mapping\"]/div[2]/div")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/main/nav/div/div/div/div[5]/div[2]/a[1]/div[2]/div")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/main/div/div[2]/div[2]/div[1]/div[2]/button")).click();
//        Thread.sleep(500);
//        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]")).click();
////        (토글 버튼(라디오 스위치) 버튼 클릭안됨)
//        Thread.sleep(500);
//        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[4]/button[2]")).click();
//        System.out.println("PMS연동 하기 버튼을 눌렀습니다.");
//      (/연동)
//      (객실)

//        driver.findElement(id 값으로 pms 의 객실 정보와 비교해서 일치하는 것을 찾으면 pass 그렇치 않으면 fail 출력 필요.)
//
//
//      (/객실)
//                driver.quit()
//    (운영방식 에서 대실 기본시간 변경하기)
//    driver.findElement(By.xpath("//*[@id=\"PMS-LNB\"]/div[1]/div[8]/div/div[2]/div[9]")).click();
//    System.out.println("운영 방식에 접근 하였습니다. ");
//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//    WebElement UpperArrow = driver.findElement(By.xpath("//*[@id=\"PMS-LNB\"]/div[1]/div[8]/div/div[2]/div[9]"));
//    int i = 0;
//    for(i = 1; i == 5; i++);{
//        UpperArrow.click();
//        }
//    (/운영방식 에서 대실 기본시간 변경하기)
//    driver.findElement(By.xpath("//*[@id=\"pms-operating-method-setting\"]/div[6]/button")).click();
//    driver.findElement(By.xpath("//*[@id=\"PMS-Container\"]/span/div/div/div[2]/div[2]/button[2]")).click();






    }
}
///



