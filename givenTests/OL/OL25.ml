let pi = 4.0 *. atan 1.0;;
(* pi : float = 3.14159265359 *)

let square x = x *. x;;
(* square : float -> float = <fun> *)

square(sin pi) +. square(cos pi);;
(* - : float = 1.0 *)

let deriv f dx = function x -> (f(x +. dx) -. f(x)) /. dx;;
(* deriv : (float -> float) -> float -> float -> float = <fun> *)

let sin_der = deriv sin 0.000001;;
(* sin_der : float -> float = <fun> *)

sin_der pi;;
(* - : float = -1.00000000014 *)

let compose f g = function x -> f(g(x));;
(* compose : ('a -> 'b) -> ('c -> 'a) -> 'c -> 'b = <fun> *)

let cos2 = compose square cos;;
(* cos2 : float -> float = <fun> *)

cos2 pi;;
(* float = 1.0 *)

cosh 0.7;;
(* - : float = 1.25516900563 *)

atan2 0.4 0.5;;
(* - : float = 0.674740942224 *)

