package com.bean;

import java.io.Serializable;

/**
 * 税金凭证模板Bean
 * @author Administrator
 */
public class GlSjPzmb implements Serializable {
    /**
     * 
     * 
     */
    private static final long serialVersionUID = -2132502098634376517L;

    private Long kZtsjpzmbid; //账套税金凭证模板ID

    private Long kSjztsjpzmbid; //税金账套上级凭证模板ID

    private String kZtdm; //账套代码GlSjPzmbMapper.xml

    private String kSjpzmbid; //税金凭证模板ID

    private String kSfmj; //是否末级

    private String kQsgs; //取数公式

    private Integer kKjnd; //会计年度

    private Integer kKjqj; //会计期间

    private String mbmc; //模板名称

    private boolean canCheck;

    private boolean hasChoose = false; //是否已经被选择成税金凭证模板

    public Long getkZtsjpzmbid() {
        return kZtsjpzmbid;
    }

    public void setkZtsjpzmbid(Long kZtsjpzmbid) {
        this.kZtsjpzmbid = kZtsjpzmbid;
    }

    public Long getkSjztsjpzmbid() {
        return kSjztsjpzmbid;
    }

    public void setkSjztsjpzmbid(Long kSjztsjpzmbid) {
        this.kSjztsjpzmbid = kSjztsjpzmbid;
    }

    public String getkZtdm() {
        return kZtdm;
    }

    public void setkZtdm(String kZtdm) {
        this.kZtdm = kZtdm == null ? null : kZtdm.trim();
    }

    public String getkSjpzmbid() {
        return kSjpzmbid;
    }

    public void setkSjpzmbid(String kSjpzmbid) {
        this.kSjpzmbid = kSjpzmbid == null ? null : kSjpzmbid.trim();
    }

    public String getkSfmj() {
        return kSfmj;
    }

    public void setkSfmj(String kSfmj) {
        this.kSfmj = kSfmj == null ? null : kSfmj.trim();
    }

    public String getkQsgs() {
        return kQsgs;
    }

    public void setkQsgs(String kQsgs) {
        this.kQsgs = kQsgs == null ? null : kQsgs.trim();
    }

    public String getMbmc() {
        return mbmc;
    }

    public void setMbmc(String mbmc) {
        this.mbmc = mbmc;
    }

    public boolean isCanCheck() {
        return canCheck;
    }

    public void setCanCheck(boolean canCheck) {
        this.canCheck = canCheck;
    }

    public Integer getkKjnd() {
        return kKjnd;
    }

    public void setkKjnd(Integer kKjnd) {
        this.kKjnd = kKjnd;
    }

    public Integer getkKjqj() {
        return kKjqj;
    }

    public void setkKjqj(Integer kKjqj) {
        this.kKjqj = kKjqj;
    }

    public boolean isHasChoose() {
        return hasChoose;
    }

    public void setHasChoose(boolean hasChoose) {
        this.hasChoose = hasChoose;
    }

}