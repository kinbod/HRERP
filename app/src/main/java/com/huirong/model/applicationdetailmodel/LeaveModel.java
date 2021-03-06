package com.huirong.model.applicationdetailmodel;

import java.io.Serializable;
import java.util.List;

/**
 * 请假
 * Created by sjy on 2016/12/26.
 */

public class LeaveModel implements Serializable {
    private static final long serialVersionUID = 1L;

    public String Comment;
    public String EndDate;
    public String StartDate;
    public String Days;
    public String Content;

    public String Reason;
    public String Remark;
    public String StoreID;
    public String CreateTime;
    public String ActiveFlg;
    public String ApplicationTitle;
    public String ApplicationID;
    public String ApplicationCreateTime;

    public String ApprovalStatus;
    public String DepartmentName;
    public String EmployeeName;
    public String EmployeeID;
    public String StoreName;
    public List<String> ImageLists;//图片路径集合

    public List<LeaveModel.ApprovalInfoLists> ApprovalInfoLists;

    public List<String> getImageLists() {
        return ImageLists;
    }

    public void setImageLists(List<String> imageLists) {
        ImageLists = imageLists;
    }

    public String getApplicationTitle() {
        return ApplicationTitle;
    }

    public void setApplicationTitle(String applicationTitle) {
        ApplicationTitle = applicationTitle;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public static class ApprovalInfoLists implements Serializable {
        public String Comment;
        public String ApprovalDate;
        public String YesOrNo;
        public String ApprovalEmployeeName;

        public String getComment() {
            return Comment;
        }

        public void setComment(String comment) {
            Comment = comment;
        }

        public String getApprovalDate() {
            return ApprovalDate;
        }

        public void setApprovalDate(String approvalDate) {
            ApprovalDate = approvalDate;
        }

        public String getYesOrNo() {
            return YesOrNo;
        }

        public void setYesOrNo(String yesOrNo) {
            YesOrNo = yesOrNo;
        }

        public String getApprovalEmployeeName() {
            return ApprovalEmployeeName;
        }

        public void setApprovalEmployeeName(String approvalEmployeeName) {
            ApprovalEmployeeName = approvalEmployeeName;
        }
    }

    public List<LeaveModel.ApprovalInfoLists> getApprovalInfoLists() {
        return ApprovalInfoLists;
    }

    public void setApprovalInfoLists(List<LeaveModel.ApprovalInfoLists> approvalInfoLists) {
        this.ApprovalInfoLists = approvalInfoLists;
    }

    public String getDays() {
        return Days;
    }

    public void setDays(String days) {
        Days = days;
    }

    public String getStoreID() {
        return StoreID;
    }

    public void setStoreID(String storeID) {
        StoreID = storeID;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getActiveFlg() {
        return ActiveFlg;
    }

    public void setActiveFlg(String activeFlg) {
        ActiveFlg = activeFlg;
    }

    public String getApplicationID() {
        return ApplicationID;
    }

    public void setApplicationID(String applicationID) {
        ApplicationID = applicationID;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }


    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public String getApprovalStatus() {
        return ApprovalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        ApprovalStatus = approvalStatus;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String storeName) {
        StoreName = storeName;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getApplicationCreateTime() {
        return ApplicationCreateTime;
    }

    public void setApplicationCreateTime(String applicationCreateTime) {
        ApplicationCreateTime = applicationCreateTime;
    }
}
