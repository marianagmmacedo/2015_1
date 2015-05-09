<?php 

$transaction = new MyTransaction();
$transaction->returnMoney();

class MyTransaction{ 

    private $amount;
    private $hundred = 0 ;
    private $fifty = 0 ;
    private $twenty = 0 ;
    private $ten = 0 ;
    private $five = 0 ;
    private $one = 0 ;
    private $quarter = 0; //25 cents
    private $dime = 0; //10 cents
    private $nickel = 0; //5 cents
    private $penny = 0; //1 cents
    private $change = 0;
    private $auxiliar =0;
    private $price;


  public function returnMoney(){
    
  	
  	$this->price = $_POST['price'];
    $this->amount = $_POST['amount'];
    //$this->price = number_format($this->price, 2, '.', ',');
    //$this->amount = number_format($this->amount, 2, '.', ',');
    $this->price = round($this->price, 2);
    $this->amount = round($this->amount, 2);
    
    if($this->price>$this->amount){
    	echo 'You are giving me less than price' ;
    	$this->change= $this->price-$this->amount;
    	echo '<br> You are in debit of ' . $this->change;

    }else{

	    echo '<br> Your price is ' . $this->price;
	   	echo '<br> Your amount is ' . $this->amount;

	    $this->change = $this->amount - $this->price;
	    $this->change = round($this->change, 2);
	    //$this->change = number_format($this->change, 2, '.', ',');

	    echo '<br> Your change is ' . $this->change . ' <br> ';

	    $this->change = $this->change*1000;
	    
	    if($this->change < 9){
	    	$this->change = 0 ;
	    }

	    while($this->change > 9){

	      if($this->change >=100000){
	        
	        $this->hundred++;
	        $this->change -= 100000;
	        
	        }elseif ($this->change >=50000) {
	            $this->fifty++;
	            $this->change -= 50000;
	          	
	          	}elseif ($this->change>=20000) {
	              
	              $this->twenty++;
	              $this->change -= 20000;
	           
	            }elseif ($this->change>=10000) {

	                $this->ten++;$this->change -= 10000;

	              }elseif ($this->change>=5000) {
	                   $this->five++;$this->change -= 5000;

	                }elseif ($this->change>=1000) {

	                      $this->one++;$this->change -= 1000;

	                  }elseif ($this->change>=250) {

	                        $this->quarter++;$this->change -= 250;

	                    }elseif ($this->change>=100) {

	                          $this->dime++;$this->change -= 100;

	                        }elseif ($this->change>=50) {

	                            $this->nickel++;$this->change -= 50;

	                            }elseif ($this->change>=10) {

	                                $this->penny++;$this->change -= 10;
	        					}
	    
	      
	      

	    }



	    echo '<br><table><tr><td>$100</td><td>' . $this->hundred . '</td></tr><tr><td>$50</td><td>' . $this->fifty
	    		. '</td></tr><tr><td>$20</td><td>' . $this->twenty . '</td></tr><tr><td>$10</td><td>' . $this->ten
	    		. '</td></tr><tr><td>$5</td><td>' . $this->five . '</td></tr><tr><td>$1</td><td>' . $this->one
	    		. '</td></tr><tr><td>Quarter</td><td>' . $this->quarter. '</td></tr><tr><td>Dime</td><td>' . $this->dime
	    		. '</td></tr><tr><td>Nickel</td><td>' . $this->nickel. '</td></tr><tr><td>Penny</td><td>' . $this->penny . '</td></tr></table>';


	  }
	}
} 


 ?>