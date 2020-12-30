package app.tulz.tailwind
package ops.htmltag.button.style

import theme.ButtonStyleColors
import app.tulz.laminar.ext._
import app.tulz.laminext.AmendedHtmlTag
import app.tulz.laminext.AmendedHtmlTagPartial
import com.raquo.laminar.api.L._
import org.scalajs.dom

class HtmlTagTailwindButtonOutlineOps[T <: dom.html.Element](
  tag: AmendedHtmlTagPartial[T, AmButtonOutlineExpectColor]
) extends HtmlTagTailwindButtonStyleOps[T] {

  @inline def custom(styles: ButtonStyleColors): AmendedHtmlTag[T, AmButtonWithStyle] =
    tag
      .amend(
        cls := classJoin(styles.base, styles.outline, styles.single.outline)
      ).build

}