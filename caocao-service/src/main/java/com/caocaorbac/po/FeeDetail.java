package com.caocaorbac.po;

import lombok.Data;

@Data
public class FeeDetail {
    /*公司本金*/
    private long companyFee;
    /*赠额*/
    private long donate;
    /*公司本金变动额，发生改价时才有*/
    private long companyFeeChange;
    /*赠额变动额，发生改价时才有 */
    private long donateChange;
}
