/**
 * login.js
 */
 
 $(document	).ready(function(){
	$('#frmLogin').on('submit',function(){
		event.preventDefault();
		
		var userId = $('#user_id').val();
		var userPw = $('#user_pw').val();
		
		$.ajax({
			type:"post",
			url:"login",
			data:{id: userId,
						pw: userPw},
			dataType:"text",
			success:function(result){
				//alert(result);
				
				if(result == "success")
					message = "로그인 성공"
				else
					message= "로그인 실패"
				alert(message);
			},
			error:function(data, textStatus){
				alert("전송실패");
			},
			complete:function(data, textStatus){
				alert("작업을 완료했습니다.");
			}
		}) //ajax
	})
})