package org.biojava.nbio.structure.io.cif;

import org.rcsb.cif.model.generated.*;

/**
 * Defines a rather generic interface which allows to populate some data structure with data parsed from a CIF file.
 *
 * @param <S> the type of container an implementing class will return
 * @author Sebastian Bittrich <sebastian.bittrich@rcsb.org>
 * @since 5.2.1
 */
interface CifFileConsumer<S> {
    /**
     * Setup routine which initializes a new container.
     */
    void prepare();

    /**
     * Consume a particular Cif category.
     * @param atomSite data
     */
    void consumeAtomSite(AtomSite atomSite);

    /**
     * Consume a particular Cif category.
     * @param atomSites data
     */
    void consumeAtomSites(AtomSites atomSites);

    /**
     * Consume a particular Cif category.
     * @param auditAuthor data
     */
    void consumeAuditAuthor(AuditAuthor auditAuthor);

    /**
     * Consume a particular Cif category.
     * @param cell data
     */
    void consumeCell(Cell cell);

    /**
     * Consume a particular Cif category.
     * @param chemComp data
     */
    void consumeChemComp(ChemComp chemComp);

    /**
     * Consume a particular Cif category.
     * @param chemCompBond data
     */
    void consumeChemCompBond(ChemCompBond chemCompBond);

    /**
     * Consume a particular Cif category.
     * @param databasePDBremark data
     */
    void consumeDatabasePDBremark(DatabasePDBRemark databasePDBremark);

    /**
     * Consume a particular Cif category.
     * @param databasePDBrev data
     */
    void consumeDatabasePDBrev(DatabasePDBRev databasePDBrev);

    /**
     * Consume a particular Cif category.
     * @param databasePDBrevRecord data
     */
    void consumeDatabasePDBrevRecord(DatabasePDBRevRecord databasePDBrevRecord);

    /**
     * Consume a particular Cif category.
     * @param entity data
     */
    void consumeEntity(Entity entity);

    /**
     * Consume a particular Cif category.
     * @param entityPoly data
     */
    void consumeEntityPoly(EntityPoly entityPoly);

    /**
     * Consume a particular Cif category.
     * @param entitySrcGen data
     */
    void consumeEntitySrcGen(EntitySrcGen entitySrcGen);

    /**
     * Consume a particular Cif category.
     * @param entitySrcNat data
     */
    void consumeEntitySrcNat(EntitySrcNat entitySrcNat);

    /**
     * Consume a particular Cif category.
     * @param entitySrcSyn data
     */
    void consumeEntitySrcSyn(PdbxEntitySrcSyn entitySrcSyn);

    /**
     * Consume a particular Cif category.
     * @param entityPolySeq data
     */
    void consumeEntityPolySeq(EntityPolySeq entityPolySeq);

    /**
     * Consume a particular Cif category.
     * @param exptl data
     */
    void consumeExptl(Exptl exptl);

    /**
     * Consume a particular Cif category.
     * @param pdbxAuditRevisionHistory data
     */
    void consumePdbxAuditRevisionHistory(PdbxAuditRevisionHistory pdbxAuditRevisionHistory);

    /**
     * Consume a particular Cif category.
     * @param pdbxChemCompIdentifier data
     */
    void consumePdbxChemCompIdentifier(PdbxChemCompIdentifier pdbxChemCompIdentifier);

    /**
     * Consume a particular Cif category.
     * @param pdbxDatabaseStatus data
     */
    void consumePdbxDatabaseStatus(PdbxDatabaseStatus pdbxDatabaseStatus);

    /**
     * Consume a particular Cif category.
     * @param pdbxEntityDescriptor data
     */
    void consumePdbxEntityDescriptor(PdbxEntityDescriptor pdbxEntityDescriptor);

    /**
     * Consume a particular Cif category.
     * @param pdbxMolecule data
     */
    void consumePdbxMolecule(PdbxMolecule pdbxMolecule);

    /**
     * Consume a particular Cif category.
     * @param pdbxMoleculeFeatures data
     */
    void consumePdbxMoleculeFeatures(PdbxMoleculeFeatures pdbxMoleculeFeatures);

    /**
     * Consume a particular Cif category.
     * @param pdbxNonpolyScheme data
     */
    void consumePdbxNonpolyScheme(PdbxNonpolyScheme pdbxNonpolyScheme);

    /**
     * Consume a particular Cif category.
     * @param pdbxReferenceEntityLink data
     */
    void consumePdbxReferenceEntityLink(PdbxReferenceEntityLink pdbxReferenceEntityLink);

    /**
     * Consume a particular Cif category.
     * @param pdbxReferenceEntityList data
     */
    void consumePdbxReferenceEntityList(PdbxReferenceEntityList pdbxReferenceEntityList);

    /**
     * Consume a particular Cif category.
     * @param pdbxReferenceEntityPolyLink data
     */
    void consumePdbxReferenceEntityPolyLink(PdbxReferenceEntityPolyLink pdbxReferenceEntityPolyLink);

    /**
     * Consume a particular Cif category.
     * @param pdbxStructAssembly data
     */
    void consumePdbxStructAssembly(PdbxStructAssembly pdbxStructAssembly);

    /**
     * Consume a particular Cif category.
     * @param pdbxStructAssemblyGen data
     */
    void consumePdbxStructAssemblyGen(PdbxStructAssemblyGen pdbxStructAssemblyGen);

    /**
     * Consume a particular Cif category.
     * @param pdbxStructModResidue data
     */
    void consumePdbxStructModResidue(PdbxStructModResidue pdbxStructModResidue);

    /**
     * Consume a particular Cif category.
     * @param pdbxStructOperList data
     */
    void consumePdbxStructOperList(PdbxStructOperList pdbxStructOperList);

    /**
     * Consume a particular Cif category.
     * @param refine data
     */
    void consumeRefine(Refine refine);

    /**
     * Consume a particular Cif category.
     * @param struct data
     */
    void consumeStruct(Struct struct);

    /**
     * Consume a particular Cif category.
     * @param structAsym data
     */
    void consumeStructAsym(StructAsym structAsym);

    /**
     * Consume a particular Cif category.
     * @param structConf data
     */
    void consumeStructConf(StructConf structConf);

    /**
     * Consume a particular Cif category.
     * @param structConn data
     */
    void consumeStructConn(StructConn structConn);

    /**
     * Consume a particular Cif category.
     * @param structConnType data
     */
    void consumeStructConnType(StructConnType structConnType);

    /**
     * Consume a particular Cif category.
     * @param structKeywords data
     */
    void consumeStructKeywords(StructKeywords structKeywords);

    /**
     * Consume a particular Cif category.
     * @param structNcsOper data
     */
    void consumeStructNcsOper(StructNcsOper structNcsOper);

    /**
     * Consume a particular Cif category.
     * @param structRef data
     */
    void consumeStructRef(StructRef structRef);

    /**
     * Consume a particular Cif category.
     * @param structRefSeq data
     */
    void consumeStructRefSeq(StructRefSeq structRefSeq);

    /**
     * Consume a particular Cif category.
     * @param structRefSeqDif data
     */
    void consumeStructRefSeqDif(StructRefSeqDif structRefSeqDif);

    /**
     * Consume a particular Cif category.
     * @param structSheetRange data
     */
    void consumeStructSheetRange(StructSheetRange structSheetRange);

    /**
     * Consume a particular Cif category.
     * @param structSite data
     */
    void consumeStructSite(StructSite structSite);

    /**
     * Consume a particular Cif category.
     * @param structSiteGen data
     */
    void consumeStructSiteGen(StructSiteGen structSiteGen);

    /**
     * Consume a particular Cif category.
     * @param symmetry data
     */
    void consumeSymmetry(Symmetry symmetry);

    /**
     * Ultimate setup which can include steps which require several categories to be available and integrate them into
     * the final container.
     */
    void finish();

    /**
     * Retrieve the created container representing a CIF file.
     * @return all desired information wrapped as object of type <code>S</code>
     */
    S getContainer();
}
