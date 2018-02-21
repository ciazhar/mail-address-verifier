package co.mailtarget.mailaddressverifier.service

import co.mailtarget.mailaddressverifier.resource.AddressStatus

/**
 * Created by ciazhar on 20/02/18.
 * [ Documentatiion Here ]
 */
interface MailAddressVerifierService {
    fun validate(mailAddress : String) : AddressStatus
}