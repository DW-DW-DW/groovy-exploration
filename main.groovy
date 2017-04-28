println "testing Groovy"

def dogs = ["Spot", "Lassie", "Laika"]

for (dog in dogs) {
	println "$dog"
}

def rankings = 1..10
println rankings

def enum DAYS {
	MON,
	TUE,
	WED,
	THU,
	FRI,
	SAT,
	SUN
}

def weekdays = DAYS.MON..DAYS.FRI

println weekdays.from
println weekdays.to

println greet("Daisy")

def greet(name) {
	"Hello " + name //don't even need the return statement
}

def testClosure = { println Math.random() }
testClosure()
testClosure()

(1..3).each({
	println "Hello, it's " + new Date()
	//sleep(1000)
})





