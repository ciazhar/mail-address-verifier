package co.mailtarget.mailaddressverifier.resource

/**
 * Created by ciazhar on 21/02/18.
 * [ Documentatiion Here ]
 */

enum class AddressStatus {
    /// absolutely valid
    valid,
    /// wrong email regex
    wrongSchema,
    /// mail server not exists
    noMxRecord,
    /// user not exists in mail server
    notRegistered,
    /// mail server exists and mail address may exits, but not include in gmail/yahoo/outlook
    notExistsInGmailOrYahooOrOutlook,
    /// mail address unknown
    unknown;

    private var mail: String? = null

    fun setMailAddress(mail: String): AddressStatus {
        this.mail = mail
        return this
    }
}
