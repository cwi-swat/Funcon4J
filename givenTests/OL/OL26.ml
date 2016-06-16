let rec append xs ys = match xs with
                         | []      -> ys
                         | [x :: xs] -> (x :: append xs ys) ;;
(* append : 'a list -> 'a list -> 'a list = <fun> *)

append [1,2] [4,5];;
(* - : int list = [1; 2; 4; 5] *)
