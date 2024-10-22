
@ArrayPage
Feature: Validation of Array Page

	Background: The user is logged in to DS Algo portal
		Given The user is on Signin page of DS Algo portal
		When The user enter valid "kodetesters" and "numpyninja24"
		And The user click on login button
		Then The user redirected to homepage

	#Array01
	Scenario: Validation of Array page
		Given The user is on Home page after logged in
		When user clicks on Array getstarted
		Then User should be redirected to "Array" page

	#Array02
	Scenario: Validation of Arrays in Python link
		Given User is on "Array page" after logged in
		When User clicks on Arrays in Python link
		Then User should be redirected to "Arrays in Python" page

	#Array03
	Scenario: Validation of Try Here button
		Given User is on "Arrays in Python page" after logged in
		When User clicks on "Try Here" button in "Arrays in Python page"
		Then User should be redirected to a page having an tryEditor with a Run button to test

	#Array04
	Scenario Outline: Validation of valid python code in TryEditor page
		Given User is on "Try Editor Page" after logged in
		When User enters valid Python code from sheet "<SheetName>" and <RowNumber>
		And User clicks on Run button
		Then User should be able to see the output
		Examples:
			| SheetName  | RowNumber |
			| PythonCode | 0         |

	#Array05
	Scenario Outline: Validation of error message for invalid python code in TryEditor page
		Given User is on "Try Editor Page" after logged in
		When User enters invalid Python code from sheet "<SheetName>" and <RowNumber>
		And User clicks on Run button
		Then User should be able to see error message
		Examples:
			| SheetName  | RowNumber |
			| PythonCode | 1         |

	#Array06
	Scenario: Validation of Arrays Using List link
		Given User is on "Array page" after logged in
		When User clicks on Arrays Using List link
		Then User should be redirected to "Arrays Using List" page

	#Array07
	Scenario: Validation of Try Here button
		Given User is on "Arrays Using List" after logged in
		When User clicks on "Try Here" button in "Arrays Using List"
		Then User should be redirected to a page having an tryEditor with a Run button to test

	#Array08
	Scenario Outline: Validation of valid python code in TryEditor page using Arrays Using List
		Given User is on "Try Editor Page" after logged in
		When User enters valid Python code from sheet "<SheetName>" and <RowNumber>
		And User clicks on Run button
		Then User should be able to see the output
		Examples:
			| SheetName  | RowNumber |
			| PythonCode | 0         |



	#Array09
	Scenario Outline: Validation of invalid python code in TryEditor page for Arrays Using List
		Given User is on "Try Editor Page" after logged in
		When User enters invalid Python code from sheet "<SheetName>" and <RowNumber>
		And User clicks on Run button
		Then User should be able to see error message in an Alert
		Examples:
			| SheetName  | RowNumber |
			| PythonCode | 1         |

	#Array10
	Scenario: Validation of Basic Operations in Lists link
		Given User is on "Array page" after logged in
		When User clicks on Basic Operations in Lists link
		Then User should be redirected to "Basic Operations in Lists" page

	#Array11
	Scenario Outline: Validation of valid python code in TryEditor page for Basic Operations in Lists
		Given User is on "Try Editor Page" after logged in
		When User enters valid Python code from sheet "<SheetName>" and <RowNumber>
		And User clicks on Run button
		Then User should be able to see the output
		Examples:
			| SheetName  | RowNumber |
			| PythonCode | 0         |

	#Array12
	Scenario Outline: Validation of invalid python code in TryEditor page for Basic Operations in Lists
		Given User is on "Try Editor Page" after logged in
		When User enters invalid Python code from sheet "<SheetName>" and <RowNumber>
		And User clicks on Run button
		Then User should be able to see error message in an Alert box
		Examples:
			| SheetName  | RowNumber |
			| PythonCode | 1         |

	#Array13
	Scenario: Validation of Applications of Arrays link
		Given User is on "Array page" after logged in
		When User clicks on Applications of Array link
		Then User should be redirected to "Applications of Array" page

	#Array14
	Scenario Outline: Validation of valid python code in TryEditor page for Applications of Array
		Given User is on "Try Editor Page" after logged in
		When User enters valid Python code from sheet "<SheetName>" and <RowNumber>
		And User clicks on Run button
		Then User should be able to see the output
		Examples:
			| SheetName  | RowNumber |
			| PythonCode | 0         |

	#Array15
	Scenario Outline: Validation of invalid python code in TryEditor page for Applications of Array
		Given User is on "Try Editor Page" after logged in
		When User enters valid Python code from sheet "<SheetName>" and <RowNumber>
		And User clicks on Run button
		Then User should be able to see an error message in an Alert
		Examples:
			| SheetName  | RowNumber |
			| PythonCode | 1         |

	#Array16
	Scenario: Validation of Practice Questions link
		Given User is on "Arrays in Python page" after logged in
		When User clicks on Practice Questions link
		Then User should be redirected to "Practice Questions" page

	#Array17
	Scenario: Validation of Search the Array link
		Given User is on "Practice page" after logged in
		When User clicks on Search the Array link
		Then User should be redirected to Questions page contains a tryEditor with Run and Submit buttons

	@Array18
	Scenario Outline: Validation of valid python code in Practice Questions page for Search for Array link
		Given User is on "Question" page of "Search the array" after logged in
		When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
		And User clicks on Run button
		Then User should be able to see the Result
		Examples:
			| SheetName  | RowNumber |
			| PythonCode | 2         |

	#Array19
	Scenario Outline: Validation of Submit button in Practice Questions page for Search for Array link
		Given User is on "Question" page of "Search the array" after logged in
		When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
		And User clicks on Submit button
		Then User should get success submission message
		Examples:
			| SheetName  | RowNumber |
			| PythonCode | 3         |

	#Array20
	Scenario: Validation of Max Consecutive Ones link
		Given User is on "Practice page" after logged in
		When User clicks on Max Consecutive Ones link
		Then User should be redirected to Questions page contains a tryEditor with Run and Submit buttons

	#Array21
	Scenario Outline: Validation of valid python code in Practice Questions page for Max Consecutive Ones link
		Given User is on "Question" page of "Max Consecutive Ones" after logged in
		When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
		And User clicks on Run button
		Then User should be able to see the Result
		Examples:
			| SheetName  | RowNumber |
			| PythonCode | 4         |

	#Array22
	Scenario Outline: Validation of Submit button in Practice Questions page for Max Consecutive Ones link
		Given User is on "Question" page of "Max Consecutive Ones" after logged in
		When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
		And User clicks on Submit button
		Then User should get success submission message
		Examples:
			| SheetName  | RowNumber |
			| PythonCode | 5         |

	#Array23
	Scenario: Validation of Find Numbers with Even Number of Digits link
		Given User is on "Practice page" after logged in
		When User clicks on Find Numbers with Even Number of Digits link
		Then User should be redirected to Questions page contains a tryEditor with Run and Submit buttons

	#Array24
	Scenario Outline: Validation of valid python code in Practice Questions page for Find Numbers with Even Numbers of Digits link
		Given User is on "Question" page of "FindNumberswithEvenNumberofDigits" after logged in
		When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
		And User clicks on Run button
		Then User should be able to see the Result
		Examples:
			| SheetName  | RowNumber |
			| PythonCode | 6         |

	#Array25
	Scenario Outline: Validation of Submit button in Practice Questions page for Find Numbers with Even Numbers of Digits link
		Given User is on "Question" page of "FindNumberswithEvenNumberofDigits" after logged in
		When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
		And User clicks on Submit button
		Then User should get success submission message
		Examples:
			| SheetName  | RowNumber |
			| PythonCode | 7         |

	#Array26
	Scenario: Validation of Squares of a Sorted Array link
		Given User is on "Practice page" after logged in
		When User clicks on Squares of a Sorted Array link
		Then User should be redirected to Questions page contains a tryEditor with Run and Submit buttons

	#Array27
	Scenario Outline: Validation of valid python code in Practice Questions page for Find Numbers with Even Numbers of Digits link
		Given User is on "Question" page of "Squares of a Sorted Array" after logged in
		When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
		And User clicks on Run button
		Then User should be able to see the Result
		Examples:
			| SheetName  | RowNumber |
			| PythonCode | 8         |

	#Array28
	Scenario Outline: Validation of Submit button in Practice Questions page for Find Numbers with Even Numbers of Digits link
		Given User is on "Question" page of "Squares of a Sorted Array" after logged in
		When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
		And User clicks on Submit button
		Then User should get success submission message
		Examples:
			| SheetName  | RowNumber |
			| PythonCode | 9         |



