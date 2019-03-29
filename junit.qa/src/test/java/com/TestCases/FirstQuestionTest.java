package com.TestCases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.TestBase.TestBase;
import com.TestPages.FirstQuestion;
import com.TestPages.SecondQuestion;
import com.TestPages.ThirdQuestion;

public class FirstQuestionTest extends TestBase {

	FirstQuestion firstquestion;
	SecondQuestion secondquestion;
	ThirdQuestion thirdquestion;

	public FirstQuestionTest() {
		super();
		SetUp();
	}

	public void SetUp() {
		initil(); // launches browser, deletes cookies, etc. (gets ready)
		firstquestion = new FirstQuestion();
		secondquestion = new SecondQuestion();
		thirdquestion = new ThirdQuestion();
	}

	@Test
	public void Verifytoggle() {
		if (thirdquestion.Removed()) {
			thirdquestion.AddElemt();
		}

		System.out.println("First Question..");
		System.out.println("Clicking toggle..");
		firstquestion.VerifyToggle();
		System.out.println("Checking if it is clicked...");
		assertEquals("VerifyCheck", true, firstquestion.VerifyCheck());

		System.out.println("clicking it again...");
		firstquestion.VerifyToggle();
		System.out.println("it should not be checked now...");
		assertEquals("VerifyCheck", false, firstquestion.VerifyCheck());

		System.out.println("Second Question..");
		System.out.println("Checking if its present...");
		assertEquals("VerifyCheck", false, secondquestion.Removed());
		System.out.println("Removing it...");
		secondquestion.RemoveIt();
		System.out.println("It should be removed by now...");
		assertEquals("VerifyCheck", true, secondquestion.Removed());
		System.out.println("Adding it back...");
		secondquestion.AddElemt();

		System.out.println("Third Question..");
		System.out.println("toggling all...");
		thirdquestion.VerifyToggle();
		System.out.println("checking if al of them are clicked...");
		assertEquals("VerifyCheck", true, thirdquestion.VerifyCheck());
		System.out.println("Remving them...");
		thirdquestion.RemoveIt();
		System.out.println("Checking if they are removed...");
		assertEquals("VerifyCheck", true, thirdquestion.Removed());
		System.out.println("Adding them back...");
		thirdquestion.AddElemt();
	}

}