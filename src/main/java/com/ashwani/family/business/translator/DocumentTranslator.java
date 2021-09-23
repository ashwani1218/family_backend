package com.ashwani.family.business.translator;

import com.ashwani.family.infra.entity.DocumentType;
import com.ashwani.family.infra.entity.FamilyMember;
import com.ashwani.family.infra.entity.MemberDocument;
import com.ashwani.family.infra.model.request.AddDocumentRequest;
import com.ashwani.family.infra.model.request.AddDocumentTypeRequest;
import com.ashwani.family.infra.repository.DocumentTypeRepository;
import com.ashwani.family.infra.repository.FamilyMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Optional;

@Service
public class DocumentTranslator {

    @Autowired
    private FamilyMemberRepository memberRepository;

    @Autowired
    private DocumentTypeRepository documentTypeRepository;

    public MemberDocument addDocumentTranslator(AddDocumentRequest request) {
        Optional<FamilyMember> member = memberRepository.findById(request.getHolder());
        Optional<DocumentType> documentType = documentTypeRepository.findByType(request.getParticular());
        return MemberDocument.builder()
                .issuerNo(request.getIssuerNumber())
                .issuerDate(request.getIssuerDate())
                .holder(member.orElse(null))
                .lastYearOfPayment(request.getLastYearOfPayment())
                .maturityAmount(request.getMaturityAmount())
                .maturityDate(request.getMaturityDate())
                .particular(documentType.orElse(null))
                .premiumAmount(request.getPremiumAmount())
                .premiumDate(request.getPremiumDate())
                .createAt(Timestamp.from(Instant.now()))
                .updatedAt(Timestamp.from(Instant.now()))
                .build();
    }

    public  DocumentType addDocumentTypeTranslator(AddDocumentTypeRequest request){
        return DocumentType.builder().type(request.getType()).build();
    }
}
