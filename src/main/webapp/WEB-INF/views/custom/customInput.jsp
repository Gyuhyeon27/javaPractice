<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<style>
	input{
		margin: 5px;
	}
  table {
    border: 1px solid #444444;
    border-collapse: collapse;
    text-align: center;
    width: 10%;
    margin-top: 10px;
  }
  th, td {
    border: 1px solid #444444;
  }
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js?autoload=false"></script>
</head>
<body>
	<div class="custom_info">
		<form method="post" name="form">
			<input type="submit" value="초기화" formaction="/Custom/customList">
			<input type="submit" value="등록" formaction="/Custom/customInput">
			<button type="button" onclick="location.href='/Custom/customUpdate'">수정</button>
			<input type="submit" value="삭제" formaction="/Custom/customDelete"><br>
			<label>사업자번호</label> <input type="text" name="busiNum" >&emsp;&emsp;&emsp;&emsp;<label>약&emsp;&emsp;&emsp;칭</label>  <input type="text" name="sHort"><br>
			<label>거 래 처 명</label>	<input type="text" name="custom"><br>
			<label>대&emsp;표&emsp;자</label> <input type="text" name="ceo">&emsp;&emsp;&emsp;&emsp;<label>담&emsp;당&emsp;자</label> <input type="text" name="chargePerson"><br>
			<label>업&emsp;&emsp;&emsp;태</label> <input type="text" name="busiCondition">&emsp;&emsp;&emsp;&emsp;<label>종&emsp;&emsp;&emsp;목</label> <input type="text" name="item"><br>
			<label>우 편 번 호</label> <input type="text" name="postNum" id="postNum"> <button type="button" onclick="execPostCode()">검색</button>&emsp;<label>주&emsp;소&emsp;1</label><input type="text" name="addr1" id="addr1"><br>
			<label>주&emsp;소&emsp;2</label><input type="text" name="addr2" id="addr2"><br>
			<label>전 화 번 호</label> <input type="text" name="tel">&emsp;&emsp;&emsp;&emsp;<label>팩 스 번 호</label> <input type="text" name="fax"><br>
			<label>홈 페 이 지</label>	<input type="text" name="homepage"><br>
			<label>법 인 여 부</label> <label><input type="radio" name="coYn" value="1">법인</label>&emsp;<label><input type="radio" name="coYn" value="2">개인</label>
			<label>해 외 여 부</label> <label><input type="radio" name="foreignYn" value="1">국내</label>&emsp;<label><input type="radio" name="foreignYn" value="2">해외</label><br>
			<label>과 세 구 분</label> <select name="taxYn"><option value="1">과세</option><option value="2">면세</option></select>&emsp;&emsp;&emsp;&emsp;
			<label>국&emsp;&emsp;가</label> <input type="text" name="countryEng"><input type="text" name="countryKor" ><button>검색</button><br>
			<label>특수관계자<input type="checkbox" name="specialRelation"></label>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<label>거 래 중 지<input type="checkbox" name="tradeStop"></label><br>
			<label>계 약 기 간</label><input type="date" name="contractPeriodS">&emsp;&emsp;&emsp;<input type="date" name="contractPeriodE"><br>
			<label>등 록 정 보</label><input type="text" name="regiInfoMan">&emsp;<input type="date" name="regiInfoDate">&emsp;
			<label>변 경 정 보</label><input type="text" name="modiInfoMan">&emsp;<input type="date" name="modiInfoDate"><br>
			<div class="account_info">
				<table>
					<tr>
						<th>사 무 소</th>
						<th>은 행</th>
						<th>계좌번호</th>
					</tr>
					<input type="hidden" name="busiNum" value="${custom.busiNum }">
					<tr>
						<td>
							<input type="text" name="factory" >
						</td>
						<td><input type="text" name="tradeBank"></td>
						<td><input type="text" name="accountNum"></td>
					</tr>
				</table>
			</div>
		</form>
	</div>
<script>
    //load함수를 이용하여 core스크립트의 로딩이 완료된 후, 우편번호 서비스를 실행합니다.
    daum.postcode.load(function(){
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
                // 예제를 참고하여 다양한 활용법을 확인해 보세요.
            }
        }).open();
    });
    
    function execPostCode(){
    	daum.postcode.load(function(){
            new daum.Postcode({
                oncomplete: function(data) {
                	// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                   // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                   // 내려오는 변수가 값이 없을땐 공백('')값을 가지므로, 이를 참고하여 분기한다.
                    var addr = ''; // 주소 변수

                    //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                    if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                        addr = data.roadAddress;
                    } else { // 사용자가 지번 주소를 선택했을 경우(J)
                        addr = data.jibunAddress;
                    }

                    // 우편번호와 주소 정보를 해당 필드에 넣는다.
                    document.getElementById('postNum').value = data.zonecode;
                    document.getElementById("addr1").value = addr;
                    
                    // 커서를 상세주소 필드로 이동한다.
                    document.getElementById("addr2").focus();
                }
            }).open();
        });
    }
</script>
</body>
</html>