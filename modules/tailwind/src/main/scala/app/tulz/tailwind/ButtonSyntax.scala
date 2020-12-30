package app.tulz.tailwind

import app.tulz.laminext.AmendedHtmlTagPartial
import app.tulz.tailwind.ops.htmltag.HtmlTagTailwindButtonInitOps
import app.tulz.tailwind.ops.htmltag.button.style.HtmlTagTailwindButtonFillOps
import app.tulz.tailwind.ops.htmltag.button.style.HtmlTagTailwindButtonGroupFillOps
import app.tulz.tailwind.ops.htmltag.button.style.HtmlTagTailwindButtonGroupOutlineOps
import app.tulz.tailwind.ops.htmltag.button.style.HtmlTagTailwindButtonGroupTransparentOps
import app.tulz.tailwind.ops.htmltag.button.style.HtmlTagTailwindButtonOutlineOps
import app.tulz.tailwind.ops.htmltag.button.style.HtmlTagTailwindButtonTransparentOps
import app.tulz.tailwind.ops.htmltag.button.HtmlTagTailwindButtonExpectSizeOrGroupOps
import app.tulz.tailwind.ops.htmltag.button.HtmlTagTailwindButtonExpectsStyleOps
import app.tulz.tailwind.ops.htmltag.button.HtmlTagTailwindButtonGroupExpectsPositionOps
import app.tulz.tailwind.ops.htmltag.button.HtmlTagTailwindButtonGroupExpectsSizeOps
import app.tulz.tailwind.ops.htmltag.button.HtmlTagTailwindButtonGroupExpectsStyleOps
import com.raquo.laminar.builders.HtmlTag
import org.scalajs.dom

trait ButtonSyntax {

  implicit def syntaxHtmlTagTailwindButtonInit[T <: dom.html.Element](
    tag: HtmlTag[T]
  ): HtmlTagTailwindButtonInitOps[T] = new HtmlTagTailwindButtonInitOps[T](tag)

  implicit def syntaxHtmlTagTailwindButtonExpectSizeOrGroup[T <: dom.html.Element](
    tag: AmendedHtmlTagPartial[T, AmButtonExpectSizeOrGroup]
  ): HtmlTagTailwindButtonExpectSizeOrGroupOps[T] =
    new HtmlTagTailwindButtonExpectSizeOrGroupOps[T](tag)

  implicit def syntaxHtmlTagTailwindButtonGroupExpectPosition[T <: dom.html.Element](
    tag: AmendedHtmlTagPartial[T, AmButtonGroupExpectsPosition]
  ): HtmlTagTailwindButtonGroupExpectsPositionOps[T] =
    new HtmlTagTailwindButtonGroupExpectsPositionOps[T](tag)

  implicit def syntaxHtmlTagTailwindButtonGroupExpectsSize[T <: dom.html.Element](
    tag: AmendedHtmlTagPartial[T, AmButtonGroupExpectsSize]
  ): HtmlTagTailwindButtonGroupExpectsSizeOps[T] =
    new HtmlTagTailwindButtonGroupExpectsSizeOps[T](tag)

  implicit def syntaxHtmlTagTailwindButtonGroupExpectsStyle[T <: dom.html.Element](
    tag: AmendedHtmlTagPartial[T, AmButtonGroupExpectsStyle]
  ): HtmlTagTailwindButtonGroupExpectsStyleOps[T] =
    new HtmlTagTailwindButtonGroupExpectsStyleOps[T](tag)

  // ---

  implicit def syntaxHtmlTagTailwindButtonGroupFill[T <: dom.html.Element](
    tag: AmendedHtmlTagPartial[T, AmButtonGroupFillExpectColor]
  ): HtmlTagTailwindButtonGroupFillOps[T] =
    new HtmlTagTailwindButtonGroupFillOps[T](tag)

  implicit def syntaxHtmlTagTailwindButtonGroupOutlineOps[T <: dom.html.Element](
    tag: AmendedHtmlTagPartial[T, AmButtonGroupOutlineExpectColor]
  ): HtmlTagTailwindButtonGroupOutlineOps[T] =
    new HtmlTagTailwindButtonGroupOutlineOps[T](tag)

  implicit def syntaxHtmlTagTailwindButtonGroupTransparentOps[T <: dom.html.Element](
    tag: AmendedHtmlTagPartial[T, AmButtonGroupTransparentExpectColor]
  ): HtmlTagTailwindButtonGroupTransparentOps[T] =
    new HtmlTagTailwindButtonGroupTransparentOps[T](tag)

  // ---

  implicit def syntaxHtmlTagTailwindButtonFill[T <: dom.html.Element](
    tag: AmendedHtmlTagPartial[T, AmButtonFillExpectColor]
  ): HtmlTagTailwindButtonFillOps[T] =
    new HtmlTagTailwindButtonFillOps[T](tag)

  implicit def syntaxHtmlTagTailwindButtonOutline[T <: dom.html.Element](
    tag: AmendedHtmlTagPartial[T, AmButtonOutlineExpectColor]
  ): HtmlTagTailwindButtonOutlineOps[T] =
    new HtmlTagTailwindButtonOutlineOps[T](tag)

  implicit def syntaxHtmlTagTailwindButtonTransparent[T <: dom.html.Element](
    tag: AmendedHtmlTagPartial[T, AmButtonTransparentExpectColor]
  ): HtmlTagTailwindButtonTransparentOps[T] =
    new HtmlTagTailwindButtonTransparentOps[T](tag)

  implicit def syntaxHtmlTagTailwindButtonExpectsStyle[T <: dom.html.Element, Am <: AmButtonExpectsStyle](
    tag: AmendedHtmlTagPartial[T, Am]
  ): HtmlTagTailwindButtonExpectsStyleOps[T, Am] =
    new HtmlTagTailwindButtonExpectsStyleOps[T, Am](tag)

}

object ButtonSyntax extends ButtonSyntax