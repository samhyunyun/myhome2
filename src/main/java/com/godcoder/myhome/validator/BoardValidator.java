package com.godcoder.myhome.validator;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.godcoder.myhome.model.Board;

@Component
public class BoardValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Board.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Board b = (Board) obj;
		if(StringUtils.isEmpty(b.getContent())) {
			errors.rejectValue("content", "key", "내용을 입력하세요");
		}
//		if(StringUtils.isEmpty(b.getContent())) {
//			errors.rejectValue("content", "key", "내용을 입력하세요");
//		}
	}

}
