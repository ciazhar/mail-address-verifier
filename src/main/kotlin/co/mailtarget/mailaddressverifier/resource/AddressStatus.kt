package co.mailtarget.mailaddressverifier.resource

/**
 * Created by ciazhar on 21/02/18.
 * [ Documentatiion Here ]
 */

enum class AddressStatus {
    valid,
    wrongSchema,
    noMxRecord,
    notRegistered,
    notExistsInGmailOrYahooOrOutlook,
    unknown;

    private var mail: String? = null

    fun setMailAddress(mail: String): AddressStatus {
        this.mail = mail
        return this
    }
}
