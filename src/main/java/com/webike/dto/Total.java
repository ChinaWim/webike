package com.webike.dto;

/**汇总Bean
 * Created by Ming on 2018/2/13.
 */
public class Total {
    //租金流水
    private int rentCount;
    //押金
    private float haveCash;

    private int totalBikeCount;

    private int inStoreBikeCount;

    private int repairBikeCount;

    private int beakdownBikeCount;

    private int totalStudentCount;

    private int borrowedCount;

    private float beakdownMoney;

    private float profitMoney;

    public int getRentCount() {
        return rentCount;
    }

    public void setRentCount(int rentCount) {
        this.rentCount = rentCount;
    }

    public float getHaveCash() {
        return haveCash;
    }

    public void setHaveCash(float haveCash) {
        this.haveCash = haveCash;
    }

    public int getTotalBikeCount() {
        return totalBikeCount;
    }

    public void setTotalBikeCount(int totalBikeCount) {
        this.totalBikeCount = totalBikeCount;
    }

    public int getInStoreBikeCount() {
        return inStoreBikeCount;
    }

    public void setInStoreBikeCount(int inStoreBikeCount) {
        this.inStoreBikeCount = inStoreBikeCount;
    }

    public int getRepairBikeCount() {
        return repairBikeCount;
    }

    public void setRepairBikeCount(int repairBikeCount) {
        this.repairBikeCount = repairBikeCount;
    }

    public int getBeakdownBikeCount() {
        return beakdownBikeCount;
    }

    public void setBeakdownBikeCount(int beakdownBikeCount) {
        this.beakdownBikeCount = beakdownBikeCount;
    }

    public int getTotalStudentCount() {
        return totalStudentCount;
    }

    public void setTotalStudentCount(int totalStudentCount) {
        this.totalStudentCount = totalStudentCount;
    }

    public int getBorrowedCount() {
        return borrowedCount;
    }

    public void setBorrowedCount(int borrowedCount) {
        this.borrowedCount = borrowedCount;
    }

    public float getBeakdownMoney() {
        return beakdownMoney;
    }

    public void setBeakdownMoney(float beakdownMoney) {
        this.beakdownMoney = beakdownMoney;
    }

    public float getProfitMoney() {
        return profitMoney;
    }

    public void setProfitMoney(float profitMoney) {
        this.profitMoney = profitMoney;
    }

    @Override
    public String toString() {
        return "Total{" +
                "rentCount=" + rentCount +
                ", haveCash=" + haveCash +
                ", totalBikeCount=" + totalBikeCount +
                ", inStoreBikeCount=" + inStoreBikeCount +
                ", repairBikeCount=" + repairBikeCount +
                ", beakdownBikeCount=" + beakdownBikeCount +
                ", totalStudentCount=" + totalStudentCount +
                ", borrowedCount=" + borrowedCount +
                ", beakdownMoney=" + beakdownMoney +
                ", profitMoney=" + profitMoney +
                '}';
    }
}

