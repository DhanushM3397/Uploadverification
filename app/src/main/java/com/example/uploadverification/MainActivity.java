package com.example.uploadverification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_greenEnergy, et_jeevanaMadhura, et_niranthara, et_NPSS, et_sHGLoanRecovery, et_suraksha,
            et_divisionUpload, et_divisionwiseTransaction1, et_groupwiseOtherTrans, et_groupwiseTrans, et_membRecoveryStlmnt,
            et_memberLoanAdjustment, et_memberLoanClosure, et_memberLoanRegularDisbursemen,
            et_memberLoanSpecialDisbursement, et_MemberTermination, et_memberwiseTransaction, et_nonCardAmount, et_SHGLoanRecovery, et_SHGLoanRecoverynoncash, et_terminatedSHGBalance, et_GSTUnregistered,
            et_TerminatedSHGBalance2, et_DestituteCompensation, et_DivisionwiseTransaction2, et_NirantharaSubscription2, et_LICPremiumCashCollection, et_PHSCCollection;
    ;
    Button bt_submit, bt_report;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        databaseHelper = new DatabaseHelper(this);
    }

    public void init() {
        et_greenEnergy = findViewById(R.id.et_greenEnergy);
        et_jeevanaMadhura = findViewById(R.id.et_jeevanaMadhura);
        et_niranthara = findViewById(R.id.et_niranthara);
        et_NPSS = findViewById(R.id.et_NPSS);
        et_sHGLoanRecovery = findViewById(R.id.et_sHGLoanRecovery);
        et_suraksha = findViewById(R.id.et_suraksha);
        et_divisionUpload = findViewById(R.id.et_divisionUpload);
        et_divisionwiseTransaction1 = findViewById(R.id.et_divisionwiseTransaction);
        et_groupwiseOtherTrans = findViewById(R.id.et_groupwiseOtherTrans);
        et_groupwiseTrans = findViewById(R.id.et_groupwiseTrans);
        et_membRecoveryStlmnt = findViewById(R.id.et_membRecoveryStmnt);
        et_memberLoanAdjustment = findViewById(R.id.et_memberLoanAdjustment);
        et_memberLoanClosure = findViewById(R.id.et_memberLoanClosure);
        et_memberLoanRegularDisbursemen = findViewById(R.id.et_memberLoanRegularDisbursemen);
        et_memberLoanSpecialDisbursement = findViewById(R.id.et_memberLoanSpecialDisbursement);
        et_MemberTermination = findViewById(R.id.et_MemberTermination);
        et_memberwiseTransaction = findViewById(R.id.et_memberwiseTransaction);
        et_nonCardAmount = findViewById(R.id.et_nonCardAmount);
        et_SHGLoanRecovery = findViewById(R.id.et_SHGLoanRecovery);
        et_terminatedSHGBalance = findViewById(R.id.et_TerminatedSHGBalance);
        et_GSTUnregistered = findViewById(R.id.et_GSTUnregistered);
        et_TerminatedSHGBalance2 = findViewById(R.id.et_TerminatedSHGBalance2);
        et_DestituteCompensation = findViewById(R.id.et_DestituteCompensation);
        et_DivisionwiseTransaction2 = findViewById(R.id.et_DivisionwiseTransaction2);
        et_NirantharaSubscription2 = findViewById(R.id.et_NirantharaSubscription2);
        et_LICPremiumCashCollection = findViewById(R.id.et_LICPremiumCashCollection);
        et_PHSCCollection = findViewById(R.id.et_PHSCCollection);

        bt_submit = findViewById(R.id.bt_submit);
        bt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inertData();
            }
        });

    }

    private void inertData() {


        if (TextUtils.isEmpty(et_greenEnergy.getText().toString())) {
            et_greenEnergy.setError("Enter green energy information");
            return;
        }

        if (TextUtils.isEmpty(et_jeevanaMadhura.getText().toString())) {
            et_jeevanaMadhura.setError("Enter jeevanamadura inforamation");
            return;
        }

        if (TextUtils.isEmpty(et_niranthara.getText().toString())) {
            et_niranthara.setError("Enter nirantara");
            return;
        }

        if (TextUtils.isEmpty(et_NPSS.getText().toString())) {
            et_NPSS.setError("Enter npss");
            return;
        }

        if (TextUtils.isEmpty(et_sHGLoanRecovery.getText().toString())) {
            et_sHGLoanRecovery.setError("Enter loan Recovery information");
            return;
        }

        if (TextUtils.isEmpty(et_suraksha.getText().toString())) {
            et_suraksha.setError("Enter Suraksha information");
            return;
        }

        if (TextUtils.isEmpty(et_divisionUpload.getText().toString())) {
            et_divisionUpload.setError("Enter Division upload information");
            return;
        }

        if (TextUtils.isEmpty(et_divisionwiseTransaction1.getText().toString())) {
            et_divisionwiseTransaction1.setError(" enter divisionwiseTransaction1 info");
            return;
        }
        if (TextUtils.isEmpty(et_groupwiseOtherTrans.getText().toString())) {
            et_groupwiseOtherTrans.setError("Enter gropup wise other transction");
            return;
        }

        if (TextUtils.isEmpty(et_groupwiseTrans.getText().toString())) {
            et_groupwiseTrans.setError("Enter group wise Transction");
            return;
        }


        if (TextUtils.isEmpty(et_membRecoveryStlmnt.getText().toString())) {
            et_membRecoveryStlmnt.setError("Enter membRecoveryStmnt");
            return;
        }

        if (TextUtils.isEmpty(et_memberLoanAdjustment.getText().toString())) {
            et_memberLoanAdjustment.setError("Enter memberLoanAdjustment ");
            return;
        }

        if (TextUtils.isEmpty(et_memberLoanClosure.getText().toString())) {
            et_memberLoanClosure.setError("Enter et_memberLoanClosure information");
            return;
        }

        if (TextUtils.isEmpty(et_memberLoanRegularDisbursemen.getText().toString())) {
            et_memberLoanRegularDisbursemen.setError("Enter memberLoanRegularDisbursemen information");
            return;
        }
        if (TextUtils.isEmpty(et_memberLoanSpecialDisbursement.getText().toString())) {
            et_memberLoanSpecialDisbursement.setError("Enter memberLoanSpecialDisbursement information ");
            return;
        }

        if (TextUtils.isEmpty(et_MemberTermination.getText().toString())) {
            et_MemberTermination.setError("Enter MemberTermination information");
            return;
        }
        if (TextUtils.isEmpty(et_memberwiseTransaction.getText().toString())) {
            et_memberwiseTransaction.setError("Enter No SILT TRANSPORTATION");
            return;
        }

        if (TextUtils.isEmpty(et_nonCardAmount.getText().toString())) {
            et_nonCardAmount.setError("Enter NonCardAmount");
            return;
        }
        if (TextUtils.isEmpty(et_SHGLoanRecovery.getText().toString())) {
            et_SHGLoanRecovery.setError("please enter the SHGLoanRecovery");
            return;
        }

        if (TextUtils.isEmpty(et_terminatedSHGBalance.getText().toString())) {
            et_terminatedSHGBalance.setError("Enter TerminatedSHGBalancePaid");
            return;
        }
        if (TextUtils.isEmpty(et_GSTUnregistered.getText().toString())) {
            et_GSTUnregistered.setError("enter the gst unregister info");
            return;
        }
        if (TextUtils.isEmpty(et_TerminatedSHGBalance2.getText().toString())) {
            et_TerminatedSHGBalance2.setError(" enter the et_TerminatedSHGBalance2");
            return;
        }
        if (TextUtils.isEmpty(et_DivisionwiseTransaction2.getText().toString())) {
            et_DivisionwiseTransaction2.setError("please DivisionwiseTransaction2");
            return;
        }
        if (TextUtils.isEmpty(et_DestituteCompensation.getText().toString())) {
            et_DestituteCompensation.setError(" enter DestituteCompensation");
        }
        if (TextUtils.isEmpty(et_NirantharaSubscription2.getText().toString())) {
            et_NirantharaSubscription2.setError(" enter NirantharaSubscription2");
            return;
        }
        if (TextUtils.isEmpty(et_LICPremiumCashCollection.getText().toString())) {
            et_LICPremiumCashCollection.setError("enter the LICPremiumCashCollection info");
            return;
        }
        if (TextUtils.isEmpty(et_PHSCCollection.getText().toString())) {
            et_PHSCCollection.setError("enter the PHSCCollection infomation");
            return;
        }
        Transport_Model transport_model = new Transport_Model();
        transport_model.setGreenEnergy(et_greenEnergy.getText().toString());
        transport_model.setJeevanaMadhura(et_jeevanaMadhura.getText().toString());
        transport_model.setNiranthara(et_niranthara.getText().toString());
        transport_model.setNPSS(et_NPSS.getText().toString());
        transport_model.setsHGLoanRecovery(et_sHGLoanRecovery.getText().toString());
        transport_model.setSuraksha(et_suraksha.getText().toString());
        transport_model.setDivisionUpload(et_divisionUpload.getText().toString());
        transport_model.setDivisionwiseTransaction1(et_divisionwiseTransaction1.getText().toString());
        transport_model.setGroupwiseOtherTrans(et_groupwiseOtherTrans.getText().toString());
        transport_model.setGroupwiseTrans(et_groupwiseTrans.getText().toString());
        transport_model.setMembRecoveryStlmnt(et_membRecoveryStlmnt.getText().toString());
        transport_model.setMemberLoanAdjustment(et_memberLoanAdjustment.getText().toString());
        transport_model.setMemberLoanClosure(et_memberLoanClosure.getText().toString());
        transport_model.setMemberLoanRegularDisbursemen(et_memberLoanRegularDisbursemen.getText().toString());
        transport_model.setMemberLoanSpecialDisbursement(et_memberLoanSpecialDisbursement.getText().toString());
        transport_model.setMemberTermination(et_MemberTermination.getText().toString());
        transport_model.setMemberwiseTransaction(et_memberwiseTransaction.getText().toString());
        transport_model.setNonCardAmount(et_nonCardAmount.getText().toString());
        transport_model.setSHGLoanRecoverynoncash(et_SHGLoanRecovery.getText().toString());
        transport_model.setTerminatedSHGBalance(et_terminatedSHGBalance.getText().toString());
        transport_model.setGSTUnregistered(et_GSTUnregistered.getText().toString());
        transport_model.setTerminatedSHGBalance2(et_TerminatedSHGBalance2.getText().toString());
        transport_model.setDestituteCompensation(et_DestituteCompensation.getText().toString());
        transport_model.setDivisionwiseTransaction2(et_DivisionwiseTransaction2.getText().toString());
        transport_model.setNirantharaSubscription2(et_NirantharaSubscription2.getText().toString());
        transport_model.setLICPremiumCashCollection(et_LICPremiumCashCollection.getText().toString());
        transport_model.setPHSCCollection(et_PHSCCollection.getText().toString());


        databaseHelper.insertdata(transport_model, databaseHelper);
        Toast.makeText(getApplicationContext(), "Inserted", Toast.LENGTH_LONG).show();
    }
}