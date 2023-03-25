package Homework.HW_7;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LogBuilder<E>{
        private String statusDo;
        private E item1;
        private E item2;
        private E answer;
}
