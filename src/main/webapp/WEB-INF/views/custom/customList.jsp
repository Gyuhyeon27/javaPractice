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
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="search_custom">
		<form action="/Custom/customList">
			<label>사업자번호</label> <input type="text" name="busi_num"
				placeholder="사업자 번호를 입력하세요."><br> <label>거래처명&emsp;</label>
			<input type="text" name="custom" placeholder="거래처명을 입력하세요."><br>
			<input type="submit" value="조회">
		</form>
	</div>
	<div class="custom_list">
		<table>
			<tr>
				<th>사업자번호</th>
				<th>거래처명</th>
			</tr>
			<tr>
				<td id="bn" ondblclick = "CustomInfo()">${custom.busiNum }</td>
				<td id="custom" ondblclick = "CustomInfo()">${custom.custom }</td>
			</tr>
		</table>
	</div>
		<div class="custom_info" id="custom_info" style="display: none;">
		<form method="post" name="form">
			<input type="submit" value="초기화" formaction="/Custom/customList">
			<button type="button" onclick="location.href='/Custom/customInput'">등록</button>
			<button type="button" onclick="location.href='/Custom/customUpdate'">수정</button>
			<input type="submit" value="삭제" formaction="/Custom/customDelete"><br>
			<label>사업자번호</label> <input type="text" name="busi_num" value="${custom.busiNum }">&emsp;&emsp;&emsp;&emsp;<label>약&emsp;&emsp;&emsp;칭</label>  <input type="text" name="short" value="${custom.sHort }"><br>
			<label>거 래 처 명</label>	<input type="text" name="custom" value="${custom.custom }"><br>
			<label>대&emsp;표&emsp;자</label> <input type="text" name="ceo" value="${custom.ceo }">&emsp;&emsp;&emsp;&emsp;<label>담&emsp;당&emsp;자</label> <input type="text" name="ceo" value="${custom.chargePerson }"><br>
			<label>업&emsp;&emsp;&emsp;태</label> <input type="text" name="busi_condition" value="${custom.busiCondition }">&emsp;&emsp;&emsp;&emsp;<label>종&emsp;&emsp;&emsp;목</label> <input type="text" name="item" value="${custom.item }"><br>
			<label>우 편 번 호</label> <input type="text" name="post_num" value="${custom.postNum }"> <button>검색</button>&emsp;<label>주&emsp;소&emsp;1</label><input type="text" name="addr1" value="${custom.addr1 }"><br>
			<label>주&emsp;소&emsp;2</label><input type="text" name="addr2" value="${custom.addr2 }"><br>
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
	function CustomInput() {
		location.href="/Custom/customInput";
	}
	
	function CustomInfo() {
		var con = document.getElementById("custom_info");
		
		if(con.style.display=='none'){
			con.style.display = 'block';
		}else{
			con.style.display = 'none';
		}
	}
</script>
</body>
</html>
