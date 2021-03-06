(* Structural Equality *)

7 <> 8 ;;
(* - : bool = true *)

let x = 1 ;;
(* x : int = 1 *)

x = x ;;
(* - : bool = true *)

let r1 = ref 1 ;;
(* r1 : int ref = ref 1 *)

r1 = r1 ;;
(* - : bool = true *)

let r2 = ref 2
and r3 = ref 2 ;;
(* r2 : int ref = ref 2
   r3 : int ref = ref 2 *)
 
r2 = r3 ;;
(* - : bool = true *)

r1 = r2 ;;
(* - : bool = false *)

(5,4) = (5,3) ;;
(* - : bool = false *)

[ 1 ] = [ 1 ] ;;
(* - : bool = true *)

let eq () = (function _ -> ()) = (function _ -> ()) ;;
(* eq : unit -> bool = <fun> *)

eq () ;;
(* Invalid_argument "equal: functional value" *)
