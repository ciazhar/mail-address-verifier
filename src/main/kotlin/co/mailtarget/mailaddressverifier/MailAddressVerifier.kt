package co.mailtarget.mailaddressverifier

import co.mailtarget.mailaddressverifier.resource.AddressStatus
import co.mailtarget.mailaddressverifier.service.MailAddressVerifierServiceImpl

object MailAddressVerifier {

    private val service by lazy {MailAddressVerifierServiceImpl()}

    @JvmStatic
    fun validate(content : String) : AddressStatus {
        return service.validate(content)
    }

}