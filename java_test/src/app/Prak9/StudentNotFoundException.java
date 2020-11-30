package app.Prak9;

class StudentNotFoundException extends Exception {
    StudentNotFoundException(String s) {
        super(s);
    }
}

class EmptyStringException extends Exception {
    EmptyStringException(String s) {
        super(s);
    }
}
