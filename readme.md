1. 자바 설치 및 확인

1) 구글에서 'zulu jdk 11 다운로드' 검색

2) Download Azul JDKs 링크를 클릭한 후 나오는 페이지에서 
   아래로 스크롤하여 원하는 Java version, Operating System, 
   Architecture 등을 찾아 원하는 설치 프로그램 다운로드 받는다.

3) Download 디렉토리(폴더)로 이동하여 다운로드 받은
   zulu11.70.15-ca-jdk11.0.22-win_x64.msi 를 더블클릭하여
   설치를 진행한다.

4) 설치 화면이 나타나면 기본 설정으로 [Next] 버튼을 누르면서
   최종 설치 확인창에서 [Install] 버튼을 누른다. 
   마지막으로 설치 종료창에서 [Finish] 버튼을 누르면 설치가 끝남
   (설치 중간에 앱 설치 변경 주의 메시지 창에서 [예]를 누름)

5) 개발 및 실행 환경을 위하여 Windows Explorer(탐색기)을 실행하고,
    '내 PC' 에서 마우스 오른쪽 버튼을 누르고, 나오는 메뉴에서 [속성]을 선택한다.

6) 나오는 [설정] 창의 오른쪽 [관련 설정] 항목의 '고급 시스템 설정'을 클릭한다.

7) 나오는 [시스템 설정]창의 세 번째 탭인 '고급' 탭의 하단부 [환경 변수] 버튼을 클릭한다.
    
8) 나오는 [환경 변수] 창의 '시스템 변수' 항목의 하단 [새로 만들기]버튼을 누르고, 
    [새 시스템 변수] 창의 '변수 이름' 항목은 'JAVA_HOME' 으로 입력
    '변수 값' 항목은 [디렉토리 찾아보기]버튼을 눌러 'C:\Program Files\Zulu\zulu-11'
    디렉토리를 찾아 선택하여 입력한 후 [확인] 버튼을 누른다.

9) [환경 변수] 창의 '시스템 변수' 항목 중에서 'Path' 항목을 선택하고, 
   하단의 [편집] 버튼을 클릭한 후 화면에 나오는 내용 중에서
   'C:\Program Files\Zulu\zulu-11\bin\'을 클릭하여 
   '%JAVA_HOME%\bin\'로 수정하고, 차례대로 모든 창의 [확인] 버튼을
   눌러 개발 환경을 설정하도록 한다.

10) [Windows 로고]를 클릭한 후 cmd 명령을 입력하고, '명령 프롬프트'를 실행한다.

11) 명령 프롬프트 창에서 'java -version' 명령을 입력하여 실행하여 아래와 같은 
     메시지가 출력되는지 확인한다.
     openjdk version "11.0.22" 2024-01-16 LTS
     OpenJDK Runtime Environment Zulu11.70+15-CA (build 11.0.22+7-LTS)
     OpenJDK 64-Bit Server VM Zulu11.70+15-CA (build 11.0.22+7-LTS, mixed mode)
     (만약, '알 수 없는 명령' 메시지가 출력되는 경우 제대로 설치되지 않았거나
      환경 변수 설정에 이상이 있는 경우이니 다시 한 번 설정 내용이나
      설치 내용을 확인한다.)


2. 이클립스(eclipse) 설치 및 테스트

1) 웹 브라우저의 검색 엔진에서 'eclipse 다운로드'라고 입력하고, 검색 결과에서
   'Eclipse Downloads | The Eclipse Foundation' 링크를 클릭한다.

2) 브라우저 화면에 나오는 다운로드 페이지에서 노란색 [Download x86_64] 버튼을
   클릭하여 운영체제에 맞는 이클립스를 다운로드한다.

3) Download 디렉토리(폴더)로 이동하여 다운로드 받은
   eclipse-inst-jre-win64.exe 를 더블클릭하여 설치를 진행한다.

4) eclipse Installer 화면에서 두 번 째 항목의 
   'Eclipse IDE for Enterprise Java and Web Developers' 를 클릭한다.

5) [Eclipse IDE for Enterprise Java and Web Developers] 설치 화면의
   설치 경로와 JVM을 확인하고, [Install] 버튼을 누른다.

6) [Eclipse Installer] 창의 [Accept Now] 을 누르고, 설치를 진행하며,
   설치가 종료되면 [Launch] 버튼이 활성화 되므로, 그 버튼을 누르면,
   Eclipse 가 실행되고, 모든 설치 작업은 종료된다.

7) [Eclipse IDE Launcher] 창에서 'Workspace'인 작업 디렉토리
   'C:\Users\user1\eclipse-workspace' 를 'D:\kim\java' 로 [browser] 버튼을
   눌러 변경하고, [Launch] 버튼을 눌러 eclipse 편집기를 실행한다.

8) 이클립스의 [Window]-[Preferences] 메뉴를 선택하여 [Preferences] 창을 열고,
   왼쪽 부분의 'Java' 항목의 세부 항목 중에서 'Installed JREs' 항목에
   [Add] 버튼을 눌러 설치한 자바의 JRE로 추가하여 변경한다.

9) [Add JRE] 창에서 'standard VM' 을 선택하고, [Next] 버튼을 누른 후 
    나오는 항목 중에서 'JRE home' 항목 입력란에는 자바를 설치한 디렉토리를 지정한다.
    현재는 zulu-11 이므로 'C:\Program Files\Zulu\zulu-11'로 지정하고,
     'JRE name' 항목 입력란에는 'zulu-11' 로 입력하고, [Finish]를 클릭한다.

10) [Installed JREs] 항목 중에서 'zulu-11' 항목만 체크하고, 나머지는 체크를 모두 해제하고,
     왼쪽 부분의 'Java' 항목의 세부 항목 중에서 'Compiler' 를 선택하고, 
     'Compiler compliance level'의 버전을 11로 변경하고, [Apply and close] 버튼을 눌러
     설정을 종료한다.

3. JAVA 시작하기

1) [File]-[New]-[Java Project] 를 선택하고, 'Project name:' (프로젝트 이름)을 입력하고
   'JRE' 항목이 JavaSE-11 인지 확인하고, [Finish] 버튼을 누른다.
   (단, 현재 Workspace에 새로 만들 프로젝트 이름과 같은 디렉토리가 존재하면 안됨.)
   (프로젝트명 : test01)

2) 추가된 프로젝트의 왼쪽 (방향 표시자)를 클릭하여 'src' 디렉토리에서 마우스 오른쪽 버튼을
   누르면 나오는 메뉴에서 [New]-[Package]를 선택하고, [New Java Package] 창의
   'Name:' 항목 입력란에 원하는 패키지이름을 입력하고, [Finish] 버튼을 누른다.
   (패키지 이름은 site.kh.org  웹 프로젝트인 경우 거꾸로 org.kh.site 로 지정하도록 한다.)
   (패키지명 : org.kh.java)

3) 해당 패키지에서 마우스 오른쪽 버튼을 누르면 나오는 메뉴에서 [New]-[Class]를 선택하고,
    [New Java Class] 창에서 'Name:' 항목 입력란에 클래스 이름을 입력하고, 
    메인 프로그램인 경우는 public static void main(String[] args) 항목을 체크하고,
    메인 프로그램이 아닌 경우는 체크하지 않으며, [Finish] 버튼을 누른다.
    (클래스명 : Hello)


4) 패키지가 org.kh.java 이고, 클래스가 Hello 인 경우 
미리 만들어진 구문의 가장 안쪽에 System.out.println("Hello~! JAVA~!"); 와 같은
실행 문장을 입력하고, 저장하기(Ctrl+S) 하면 프로그램이 완성된다.
package org.kh.java;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello~! JAVA~!");
	}
}

5) 문장 작성 후 상단 툴바의 'Run Hello' 버튼을 누르면, 실행이 되어 Console(콘솔) 창에
   'Hello~! JAVA~!' 이 출력된다.
   이 때 소스 파일은 D:\kim\java\test01\src\org\kh\java\Hello.java 로 저장되며,
   컴파일된 클래스 파일은 D:\kim\java\test01\bin\org\kh\java\Hello.class 로 저장된다.
   또한, 나중에 실제 배포되는 파일은 D:\kim\java\test01\bin\org\kh\java\Hello.class이 되어야 한다.


 





   
   

   











