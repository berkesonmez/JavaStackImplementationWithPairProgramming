import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StackTest {

   @Test
   public void it_should_return_one_more_than_size_of_stack_when_push_element(){
      //Arrange
      Stack sut = new Stack();
      //Act
      sut.push("Eleman");
      int result = sut.count();
      //Assert
      assertThat(result).isEqualTo(1);

   }


   @Test
    public void it_should_return_count_of_stack(){
       //Arrange
       Stack sut = new Stack();
       //Act
       int result = sut.count();
       //Assert
       assertThat(result).isEqualTo(0);
   }

   @Test
    public void it_should_return_index_of_element_in_stack(){
       //Arrange
       Stack sut = new Stack();
       //Act
       sut.push("a");
       sut.push("b");
       sut.push("Testing");
       sut.push("c");
       Object result = sut.peek();
       //Assert
       assertThat(result).isEqualTo("c");
   }
   @Test
    public void it_should_return_popped_element_in_stack(){
       //Arrange
       Stack sut = new Stack();
       //Act
       sut.push("a");
       sut.push("b");
       sut.push("Testing");
       sut.push("c");
       Object result = sut.pop("Testing");
       //Assert
       assertThat(result).isEqualTo("c");
   }




}