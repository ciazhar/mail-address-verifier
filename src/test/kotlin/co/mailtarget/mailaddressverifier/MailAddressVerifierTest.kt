package co.mailtarget.mailaddressverifier

import org.junit.Test

class MailAddressVerifierTest{

    @Test
    fun validateEmailAddress(){
        val str = "rully.arifin@ibsolutions.co.id"
        val result = MailAddressVerifier.validate(str)
        print(result)
    }

}
