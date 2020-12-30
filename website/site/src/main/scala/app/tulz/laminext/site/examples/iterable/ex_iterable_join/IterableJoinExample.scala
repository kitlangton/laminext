package app.tulz.laminext.site.examples.iterable.ex_iterable_join

import app.tulz.laminext.site.examples.CodeExample
import app.tulz.website.macros.FileToLiteral

object IterableJoinExample
    extends CodeExample(
      id = "iterable-join",
      title = "Iterable Join",
      description = FileToLiteral("description.md")
    )(() => {
      import app.tulz.laminar.ext._
      import com.raquo.laminar.api.L._

      val spans1 = (1 to 6).map(_.toString).map(span(_))
      val spans2 = (1 to 6).map(_.toString).map(span(_))

      div(
        div(
          span("spans: "),
          div(
            cls := "space-x-4",
            spans1
          )
        ),
        div(
          span("spans.join(span(\"—\")): "),
          div(
            cls := "space-x-4",
            spans2.join(() => span("—"))
          )
        )
      )
    })