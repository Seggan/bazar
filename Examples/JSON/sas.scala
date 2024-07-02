String surroundWith::String and::String = 
  surroundWith + this + and

String surroundWith: x::String = 
  x + this + x

String packForJson -> String = 
   this escape surroundWith: "\""

String escape = 
  this replace: "\\" with: "\\\\" |>
  replace: "\"" with: "\\\"" |>
  replace: "\n" with: "\\n" |>
  replace: "\r" with: "\\r" |>
  replace: "\t" with: "\\t" |>
  replace: "\'" with: "\\'" 