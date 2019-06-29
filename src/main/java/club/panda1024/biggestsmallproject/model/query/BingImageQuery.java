package club.panda1024.biggestsmallproject.model.query;

import cn.hutool.core.date.DateUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Panda [cristopanda@gmail.com]
 * @since 2019-06-29T13:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BingImageQuery {

  private String format;
  private Integer idx;
  private Integer n;
  private Date nc;
  private String pid;

  public static Map<String, Object> defaultQuery(){
    Map<String, Object> query = new HashMap<>();

    query.put("format", "js");
    query.put("idx", 0);
    query.put("n", 1);
    query.put("nc", DateUtil.date());
    query.put("pid", "hp");

    return query;
  }


}
