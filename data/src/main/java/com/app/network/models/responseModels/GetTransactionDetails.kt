package com.app.network.models.responseModels

data class GetTransactionDetails(
    val AMOUNT: Double,
    val APPROVENUM: Int,
    val APPROVE_DETAIL: List<Any>,
    val BENEFACC: String,
    val BENEFBANKCODE: Int,
    val BENEFBANKCORACC: String,
    val BENEFBANKNAME: String,
    val BENEFBANKSWIFT: String,
    val BENEFBANKTAXID: String,
    val BENEFNAME: String,
    val BENEFTAXID: String,
    val COMMAMOUNT: Double,
    val COUNTERCIF: Any,
    val COUNTERNAME: String,
    val CUSTACC: String,
    val CUSTACCFORCOM: String,
    val CUSTADDR: String,
    val CUSTCIF: String,
    val CUSTNAME: String,
    val CUSTTAXID: String,
    val CommCode: Any,
    val HISTORY_DETAILS: List<HISTORYDETAILS>,
    val INFOTOBENEF: Any,
    val NOTE: String?,
    val PDF_LIST: List<FileDetails>,
    val PMTCUSTID: String,
    val PMTDET: String,
    val PMTID: String,
    val PMTTYPECODE: Any,
    val SIGNNUM: Int,
    val SIGN_DETAIL: List<Any>,
    val attachedPDF: Int,
    val authType: String,
    val bankNote: Any,
    val ccy: String,
    val ccyType: String,
    val createdFromTempl: Boolean,
    val customerNo: Int,
    val forceSign: Any,
    val ibankRef: String,
    val id: Any,
    val phoneNumber: String,
    val source: String,
    val stepId: Any,
    val templName: Any,
    val totalApproverCount: Int,
    val totalSignerCount: Int,
    val trnAmount: Double,
    val trnRequestType: String,
    val trnStatus: String,
    val trnType: String,
    val uniqueRequestId: Any,
    val userName: String,
    val verification: Any,
    val xref: Any
)