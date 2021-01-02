package com.example.uploadverification;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ReportAdapter extends RecyclerView.Adapter<ReportAdapter.Holder> {

    Context context;
    ArrayList<Transport_Model> transport_models;

    public ReportAdapter(Context context, ArrayList<Transport_Model> transport_models) {
        this.context = context;
        this.transport_models = transport_models;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.reportlayout, null);
        view.setLayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT));
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        holder.GreenEnergy.setText(transport_models.get(position).getGreenEnergy());
        holder.JeevanaMadhura.setText(transport_models.get(position).getJeevanaMadhura());
        holder.Niranthara.setText(transport_models.get(position).getNiranthara());
        holder.NPSS.setText(transport_models.get(position).getNPSS());
        holder.sHGLoanRecovery.setText(transport_models.get(position).getsHGLoanRecovery());
        holder.Suraksha.setText(transport_models.get(position).getSuraksha());
        holder.DivisionUploaded.setText(transport_models.get(position).getDivisionUpload());
        holder.DivisionwiseTransaction.setText(transport_models.get(position).getDivisionwiseTransaction1());
        holder.GroupwiseOtherTrans.setText(transport_models.get(position).getGroupwiseOtherTrans());
        holder.MembRecoveryStlmnt.setText(transport_models.get(position).getMembRecoveryStlmnt());
        holder.MemberLoanAdjustment.setText(transport_models.get(position).getMemberLoanAdjustment());
        holder.MemberLoanClosure.setText(transport_models.get(position).getMemberLoanClosure());
        holder.RegularDisbursement.setText(transport_models.get(position).getMemberLoanRegularDisbursemen());
        holder.SpecialDisbursement.setText(transport_models.get(position).getMemberLoanSpecialDisbursement());
        holder.MemberTermination.setText(transport_models.get(position).getMemberTermination());
        holder.MemberwiseTransaction.setText(transport_models.get(position).getMemberwiseTransaction());
        holder.LoanRecoverynoncash.setText(transport_models.get(position).getSHGLoanRecoverynoncash());
        holder.NonCardAmount.setText(transport_models.get(position).getNonCardAmount());
        holder.TerminatedSHGBalance.setText(transport_models.get(position).getTerminatedSHGBalance());
        holder.GSTUnregistered.setText(transport_models.get(position).getGSTUnregistered());

        holder.TerminatedSHGBalance2.setText(transport_models.get(position).getTerminatedSHGBalance2());
        holder.DestituteCompensation.setText(transport_models.get(position).getDestituteCompensation());
        holder.DivisionwiseTransaction2.setText(transport_models.get(position).getDivisionwiseTransaction2());
        holder.NirantharaSubscription2.setText(transport_models.get(position).getNirantharaSubscription2());
        holder.LICPremiumCashCollection.setText(transport_models.get(position).getLICPremiumCashCollection());
        holder.PHSCCollection.setText(transport_models.get(position).getPHSCCollection());

    }

    @Override
    public int getItemCount() {
        return transport_models.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        TextView GreenEnergy, JeevanaMadhura, Niranthara, NPSS, sHGLoanRecovery, Suraksha, DivisionUploaded, DivisionwiseTransaction, GroupwiseOtherTrans, MembRecoveryStlmnt, MemberLoanAdjustment, MemberLoanClosure, RegularDisbursement, SpecialDisbursement, MemberTermination, MemberwiseTransaction, NonCardAmount, LoanRecoverynoncash, TerminatedSHGBalance, GSTUnregistered, TerminatedSHGBalance2, DestituteCompensation, DivisionwiseTransaction2, NirantharaSubscription2, LICPremiumCashCollection, PHSCCollection;


        public Holder(@NonNull View itemView) {
            super(itemView);
            //  name = itemView.findViewById(R.id.name);
            GreenEnergy = itemView.findViewById(R.id.greenEnergy);
            JeevanaMadhura = itemView.findViewById(R.id.jeevanaMadhura);
            Niranthara = itemView.findViewById(R.id.niranthara);
            NPSS = itemView.findViewById(R.id.nPSS);
            sHGLoanRecovery = itemView.findViewById(R.id.sHGLoanRecovery);
            Suraksha = itemView.findViewById(R.id.suraksha);
            DivisionUploaded = itemView.findViewById(R.id.divisionUploaded);
            DivisionwiseTransaction = itemView.findViewById(R.id.divTransaction);
            GroupwiseOtherTrans = itemView.findViewById(R.id.groupwiseTrans);
            MembRecoveryStlmnt = itemView.findViewById(R.id.membRecoveryStlmnt);
            MemberLoanAdjustment = itemView.findViewById(R.id.memberLoanAdjustment);
            MemberLoanClosure = itemView.findViewById(R.id.memberLoanClosure);
            RegularDisbursement = itemView.findViewById(R.id.regularDisbursement);
            SpecialDisbursement = itemView.findViewById(R.id.specialDisbursement);
            MemberTermination = itemView.findViewById(R.id.memberTermination);
            MemberwiseTransaction = itemView.findViewById(R.id.memberwiseTransaction);
            NonCardAmount = itemView.findViewById(R.id.nonCardAmount);
            LoanRecoverynoncash = itemView.findViewById(R.id.sHGLoanRecoverynoncash);
            TerminatedSHGBalance = itemView.findViewById(R.id.terminatedSHGBalance);
            GSTUnregistered = itemView.findViewById(R.id.gSTUnregistered);
            TerminatedSHGBalance2 = itemView.findViewById(R.id.terminatedSHGBalance2);
            DestituteCompensation = itemView.findViewById(R.id.destituteCompensation);
            DivisionwiseTransaction2 = itemView.findViewById(R.id.divisionwiseTransaction2);
            NirantharaSubscription2 = itemView.findViewById(R.id.nirantharaSubscription2);
            LICPremiumCashCollection = itemView.findViewById(R.id.lICPremiumCashCollection);
            PHSCCollection = itemView.findViewById(R.id.pHSCCollection);
        }
    }
}
