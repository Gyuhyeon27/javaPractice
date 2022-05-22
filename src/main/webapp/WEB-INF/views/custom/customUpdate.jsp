<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<style>
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
	input{
		margin: 5px;
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
			<button type="button" onclick="location.href='/Custom/customInput'">등록</button>
			<input type="submit" value="수정" formaction="/Custom/customUpdate">
			<input type="submit" value="삭제" formaction="/Custom/customDelete"><br>
			<label>사업자번호</label> <input type="text" name="busi_num" value="${custom.busiNum }">&emsp;&emsp;&emsp;&emsp;<label>약&emsp;&emsp;&emsp;칭</label>  <input type="text" name="short" value="${custom.sHort }"><br>
			<label>거 래 처 명</label>	<input type="text" name="custom" value="${custom.custom }"><br>
			<label>대&emsp;표&emsp;자</label> <input type="text" name="ceo" value="${custom.ceo }">&emsp;&emsp;&emsp;&emsp;<label>담&emsp;당&emsp;자</label> <input type="text" name="chargePerson" value="${custom.chargePerson }"><br>
			<label>업&emsp;&emsp;&emsp;태</label> <input type="text" name="busi_condition" value="${custom.busiCondition }">&emsp;&emsp;&emsp;&emsp;<label>종&emsp;&emsp;&emsp;목</label> <input type="text" name="item" value="${custom.item }"><br>
			<label>우 편 번 호</label> <input type="text" name="post_num" id="postNum" value="${custom.postNum }"> <button type="button" onclick="execPostCode()">검색</button>&emsp;<label>주&emsp;소&emsp;1</label><input type="text" name="addr1" id="addr1" value="${custom.addr1 }"><br>
			<label>주&emsp;소&emsp;2</label><input type="text" name="addr2" id="addr2" value="${custom.addr2 }"><br>
			<label>전 화 번 호</label> <input type="text" name="tel" value="${custom.tel }">&emsp;&emsp;&emsp;&emsp;<label>팩 스 번 호</label> <input type="text" name="fax" value="${custom.fax }"><br>
			<label>홈 페 이 지</label>	<input type="text" name="homepage" value="${custom.homepage }"><br>
			<label>법 인 여 부</label> <label><input type="radio" name="co_yn" value="${custom.coYn }">법인</label>&emsp;<label><input type="radio" name="co_yn" value="${custom.coYn }">개인</label>
			<label>해 외 여 부</label> <label><input type="radio" name="foreign_yn" value="${custom.foreignYn }">국내</label>&emsp;<label><input type="radio" name="foreign_yn" value="${custom.foreignYn }">해외</label><br>
			<label>과 세 구 분</label> <select name="tax_yn"><option value="과세">과세</option><option value="면세">면세</option></select>&emsp;&emsp;&emsp;&emsp;
			<label>국&emsp;&emsp;가</label> <input type="text" name="country_eng" value="${custom.countryEng }"><input type="text" name="country_kor" value="${custom.countryKor }"><button>검색</button><br>
			<label>특수관계자<input type="checkbox" name="special_relation" value="${custom.specialRelation }"></label>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<label>거 래 중 지<input type="checkbox" name="trade_stop" value="${custom.tradeStop }"></label><br>
			<label>계 약 기 간</label><input type="date" name="contract_period_s" value="${custom.contractPeriodS }">&emsp;&emsp;&emsp;<input type="date" name="contract_period_e" value="${custom.contractPeriodE }"><br>
			<label>등 록 정 보</label><input type="text" name="regi_info_man" value="${custom.regiInfoMan }">&emsp;<input type="date" name="regi_info_date" value="${custom.regiInfoDate }">&emsp;
			<label>변 경 정 보</label><input type="text" name="modi_info_man" value="${custom.modiInfoMan }">&emsp;<input type="date" name="modi_info_date" value="${custom.modiInfoDate }"><br>
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
							<input type="text" name="factory" value="${custom.factory }">
						</td>
						<td><input type="text" name="tradeBank" value="${custom.tradeBank }"></td>
						<td><input type="text" name="accountNum" value="${custom.accountNum }"></td>
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