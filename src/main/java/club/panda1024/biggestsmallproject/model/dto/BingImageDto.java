package club.panda1024.biggestsmallproject.model.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Panda [cristopanda@gmail.com]
 * @since 2019-06-29T14:14
 */
@Data
public class BingImageDto {

  private List<BingImageDetailDto> images;
  private BingImageTooltipsDto tooltips;

}
