package com.bean;

import java.io.Serializable;

/**
 * 税金计提凭证分录（新）Bean
 * @author Administrator
 *
 */
public class GlSjPzfl implements Serializable {
    /**
     * 
     * 
     */
    private static final long serialVersionUID = -3050497347072518204L;

    private Long kZtsjpzflid; //账套税金凭证分录ID

    private Long kZtsjpzmbid; //账套税金凭证模板ID

    private Integer kRow; //行数

    private String kZy; //摘要

    private Integer kKmfx; //科目方向

    private String kKmnm; //科目内码

    private Integer kKjnd; //会计年度

    private Integer kKjqj; //会计期间

    public Long getkZtsjpzflid() {
        return kZtsjpzflid;
    }

    public void setkZtsjpzflid(Long kZtsjpzflid) {
        this.kZtsjpzflid = kZtsjpzflid;
    }

    public Long getkZtsjpzmbid() {
        return kZtsjpzmbid;
    }

    public void setkZtsjpzmbid(Long kZtsjpzmbid) {
        this.kZtsjpzmbid = kZtsjpzmbid;
    }

    public Integer getkRow() {
        return kRow;
    }

    public void setkRow(Integer kRow) {
        this.kRow = kRow;
    }

    public String getkZy() {
        return kZy;
    }

    public void setkZy(String kZy) {
        this.kZy = kZy == null ? null : kZy.trim();
    }

    public Integer getkKmfx() {
        return kKmfx;
    }

    public void setkKmfx(Integer kKmfx) {
        this.kKmfx = kKmfx;
    }

    public String getkKmnm() {
        return kKmnm;
    }

    public void setkKmnm(String kKmnm) {
        this.kKmnm = kKmnm == null ? null : kKmnm.trim();
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

}