package com.demo.microservices;


//@RunWith(SpringRunner.class)
//@WebMvcTest(value = EmployeeController.class, secure = false)
public class EmployeeServiceTest {
//	
//  private static final int AGE = 28;
//  private static final int UPDATED_AGE = 29;
//  private static final String DOB = "10/2/1990";
//  private static final String UPDATED_DOB = "10/2/1991";
//  private static final String NAME = "EMP1";
//  private static final String NAME_UPDATED = "FooUpdated";
//  private static final String SEX = "m";
//  private static final String UPDATED_SEX = "f";
//
//  private static final String SEARCH_TERM = "foo";
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@MockBean
//	private EmployeeService employeeServiceMock;
//
//	Employee mockCourse = new Employee(NAME, AGE,DOB,SEX );
//
//	String strEmployee =  
//			"[{\"id\":4, \"name\": \"EMP5\",\"age\": 56,\"DOB\": \"ghfgh\",\"sex\":\"m\"},"
//			+ "{\"id\":5,\"name\": \"EMP5\",\"age\": 56,\"DOB\": ghfgh\", \"sex\":\"m\"}]";
//	
//	
//  @Test
//  public void testAddEmployees() throws EmployeeAddFailureException {
//  	
////      E deleted = PersonTestUtil.createModelObject(PERSON_ID, NAME, LAST_NAME);
//     when(employeeServiceMock.addEmployees(
//		Stream.of(new Employee("Emp5",45,"dfgdg","m"),new Employee("Emp6",46,"dfgdg","f")).collect(Collectors.toList())
//		)).thenReturn(Stream.of(new Employee("Emp5",45,"dfgdg","m"),new Employee("Emp6",46,"dfgdg","f")).collect(Collectors.toList()));
////          
////      verify(personRepositoryMock, times(1)).findOne(ID);
////      verifyNoMoreInteractions(personRepositoryMock);
//      
//    //  assertEquals(added, returned);
//  }
//  

//  @Test
//  public void findAll() {
//      List<Employee> persons = new ArrayList<Employee>();
//      when(emplyeeRepositoryMock.findAll()).thenReturn(persons);
//
//      List<Employee> returned = emplyeeRepositoryMock.findAll();
//
//      ArgumentCaptor<Sort> sortArgument = ArgumentCaptor.forClass(Sort.class);
//      verify(emplyeeRepositoryMock, times(1)).findAll();
//
//      verifyNoMoreInteractions(emplyeeRepositoryMock);
//
//      Sort actualSort = sortArgument.getValue();
//      assertEquals(Sort.Direction.ASC, actualSort.getOrderFor("name").getDirection());
//
//      assertEquals(persons, returned);
//  }
  

}
